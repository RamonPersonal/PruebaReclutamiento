import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FrontEncuestaComponent } from './front-encuesta.component';

describe('FrontEncuestaComponent', () => {
  let component: FrontEncuestaComponent;
  let fixture: ComponentFixture<FrontEncuestaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FrontEncuestaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FrontEncuestaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
