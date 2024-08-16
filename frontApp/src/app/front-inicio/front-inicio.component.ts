import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, ReactiveFormsModule  } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-front-inicio',
  standalone: true,
  imports: [RouterOutlet, ReactiveFormsModule, CommonModule],
  templateUrl: './front-inicio.component.html',
  styleUrl: './front-inicio.component.css'
})



export class FrontInicioComponent implements OnInit {
  title = 'front App';

  constructor(
    public fb: FormBuilder,
    private router: Router 
  ) {}

  ngOnInit(): void {

  }



  irEncuesta(): void {
    this.router.navigate(['/Encuesta']); 
  }

  irGrafica(): void {
    this.router.navigate(['/Grafica']); 
  }
}