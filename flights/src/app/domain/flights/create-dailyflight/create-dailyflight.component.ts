import { Component,OnInit } from '@angular/core';

@Component({
  selector: 'app-create-dailyflight',
  standalone: true,
  imports: [],
  templateUrl: './create-dailyflight.component.html',
  styleUrl: './create-dailyflight.component.css'
})
export class CreateDailyflightComponent implements OnInit {
  flight = {
    flightNumber: '',
    date: '',
    destination: ''
  };
  submitted = false;

  onSubmit() {
    // You can perform further actions, such as sending the data to a server.
    console.log('Flight Details:', this.flight);
    this.submitted = true;

    // Reset the form after submission (optional)
    this.flight = {
      flightNumber: '',
      date: '',
      destination: ''
    };
  }
}
