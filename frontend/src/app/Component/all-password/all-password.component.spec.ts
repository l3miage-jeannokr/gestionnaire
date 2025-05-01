import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllPasswordComponent } from './all-password.component';

describe('AllPasswordComponent', () => {
  let component: AllPasswordComponent;
  let fixture: ComponentFixture<AllPasswordComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AllPasswordComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AllPasswordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
