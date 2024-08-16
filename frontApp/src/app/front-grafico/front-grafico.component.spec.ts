import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FrontGraficoComponent } from './front-grafico.component';

describe('FrontGraficoComponent', () => {
  let component: FrontGraficoComponent;
  let fixture: ComponentFixture<FrontGraficoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FrontGraficoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FrontGraficoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
