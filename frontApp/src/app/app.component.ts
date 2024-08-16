import { Component, OnInit } from '@angular/core';
import { FormBuilder, ReactiveFormsModule  } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { EncuestaService } from './services/encuesta/encuesta.service';
import { GeneroMusicalService } from './services/generoMusical/genero-musical.service';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ReactiveFormsModule, CommonModule],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'] 
})



export class AppComponent implements OnInit {
  title = 'front App';

  constructor(
    public fb: FormBuilder,
    public encuestaService: EncuestaService,
    public generoMusicalService: GeneroMusicalService,
    private router: Router 
  ) {}

  ngOnInit(): void {
    this.irInicio();
  }

  irInicio(): void {
    this.router.navigate(['/Inicio']); 
  }

}