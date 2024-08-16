import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BaseChartDirective } from 'ng2-charts'; // Asegúrate de importar NgChartsModule aquí
import { ChartConfiguration } from 'chart.js';
import { ChartData, ChartOptions, ChartType,registerables,Chart } from 'chart.js'
import { EncuestaService } from '../services/encuesta/encuesta.service';
Chart.register(...registerables);

interface EncuestaGrafica {
  total: number;
  nombre: string;
}
@Component({
  selector: 'app-front-grafico',
  standalone: true,
  imports: [BaseChartDirective],
  templateUrl: './front-grafico.component.html',
  styleUrls: ['./front-grafico.component.css']
})
export class FrontGraficoComponent implements OnInit {


  Encuestados: EncuestaGrafica[] = [];
  radarChartLabels: string[] = [];
  radarChartData: { labels: string[], datasets: { data: number[], label: string }[] } = {
    labels: [],
    datasets: []
  };
  constructor(private router: Router,
    public encuestaService: EncuestaService,
  ) {}

  ngOnInit(): void {

    this.encuestaService.countByGenero().subscribe((res: EncuestaGrafica[]) => {
      this.Encuestados = res;

      this.radarChartLabels = this.Encuestados.map(e => e.nombre);
      const totals = this.Encuestados.map(e => e.total);

      this.radarChartData = {
        labels: this.radarChartLabels,
        datasets: [
          { data: totals, label: 'Generos Musicales' }
        ]
      };
    },
    error => {
      console.error(error);
    }
    )
  }

  irInicio(): void {
    this.router.navigate(['/Inicio']); 
  }
  public radarChartOptions: ChartOptions<'radar'> = {
    responsive: true,
  };


}