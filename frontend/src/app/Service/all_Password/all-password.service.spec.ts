import { TestBed } from '@angular/core/testing';

import { AllPasswordService } from './all-password.service';

describe('AllPasswordService', () => {
  let service: AllPasswordService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AllPasswordService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
