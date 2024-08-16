import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, ReactiveFormsModule  } from '@angular/forms';
import { EncuestaService } from '../services/encuesta/encuesta.service';
import { GeneroMusicalService } from '../services/generoMusical/genero-musical.service';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-front-encuesta',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './front-encuesta.component.html',
  styleUrl: './front-encuesta.component.css'
})



export class FrontEncuestaComponent implements OnInit {
  title = 'front App';
  encuestaForm !: FormGroup; 
  gm: any;
  emailExists: boolean | null = null;
  constructor(
    public fb: FormBuilder,
    public encuestaService: EncuestaService,
    public generoMusicalService: GeneroMusicalService,
    private router: Router,
    private toastr: ToastrService,
  ) {}

  ngOnInit(): void {
    this.encuestaForm = this.fb.group({
      email: ['', [Validators.required, Validators.email]],
      nombreGenero: ['', Validators.required]
    });

    this.generoMusicalService.getAllGeneroMusical().subscribe(res => {
      this.gm = res;
    },
    error => { console.error(error) }
    )
  }

  guardar(): void {
    if (this.encuestaForm.valid) {
      const email = this.encuestaForm.get('email')?.value;
      
      this.encuestaService.checkEmail(email).subscribe(
        exists => {
          this.emailExists = exists;
          if (!this.emailExists) {  
            this.encuestaService.saveEncuesta(this.encuestaForm.value).subscribe(
              res => {
                this.toastr.success(
                  'La encuesta se ha enviado con éxito.',
                  'Success',
                  {
                    timeOut: 1000, 
                    positionClass: 'toast-bottom-right', 
                    progressBar: true 
                  }
                );
                setTimeout(() => {
                  this.irGrafico();
                }, 1500);
              },
              error => {
                console.error(error);
                this.toastr.error(
                  'Hubo un error al enviar la encuesta. Por favor, inténtalo de nuevo.',
                  'Error',
                  {
                    timeOut: 1000, 
                    positionClass: 'toast-bottom-right', 
                    progressBar: true 
                  }
                );
              }
            );
          } else {
            this.toastr.error(
              'El email ya está registrado. Por favor, usa otro email.',
              'Error',
              {
                timeOut: 1000,
                positionClass: 'toast-bottom-right', 
                progressBar: true
              }
            );
          }
        },
        error => {
          console.error('Error checking email', error);
          this.toastr.error(
            'Hubo un error al verificar el email. Por favor, inténtalo de nuevo.',
            'Error',
            {
              timeOut: 1000,
              positionClass: 'toast-bottom-right',
              progressBar: true 
            }
          );
        }
      );
    } else {
      this.toastr.error(
        'La encuesta es inválida. Por favor, corrige los errores.',
        'Error',
        {
          timeOut: 1000, 
          positionClass: 'toast-bottom-right', 
          progressBar: true 
        }
      );
    }
  }

  irInicio(): void {
    this.router.navigate(['/Inicio']); 
  }

  irGrafico(): void {
    this.router.navigate(['/Grafica']); 
  }
}