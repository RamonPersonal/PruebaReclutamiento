import { Routes } from '@angular/router';
import { FrontEncuestaComponent } from './front-encuesta/front-encuesta.component';
import { AppComponent } from './app.component';
import { FrontGraficoComponent } from './front-grafico/front-grafico.component';
import { FrontInicioComponent } from './front-inicio/front-inicio.component';

export const routes: Routes = [
    { path: '', component: AppComponent },
    { path: 'Inicio', component: FrontInicioComponent },
    { path: 'Encuesta', component: FrontEncuestaComponent },
    { path: 'Grafica', component: FrontGraficoComponent }
  ];
