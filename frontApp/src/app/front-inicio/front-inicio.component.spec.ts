import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FrontInicioComponent } from './front-inicio.component';

describe('FrontInicioComponent', () => {
  let component: FrontInicioComponent;
  let fixture: ComponentFixture<FrontInicioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FrontInicioComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FrontInicioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
