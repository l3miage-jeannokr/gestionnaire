import { Component, inject } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { LoginComponent } from './Component/login/login.component';

@Component({
  selector: 'app-root',
  imports: [LoginComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'frontend';

}

