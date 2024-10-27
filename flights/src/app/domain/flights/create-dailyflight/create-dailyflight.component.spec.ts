import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateDailyflightComponent } from './create-dailyflight.component';

describe('CreateDailyflightComponent', () => {
  let component: CreateDailyflightComponent;
  let fixture: ComponentFixture<CreateDailyflightComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CreateDailyflightComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreateDailyflightComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
