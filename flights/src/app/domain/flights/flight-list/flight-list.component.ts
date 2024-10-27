import { Component,OnInit } from '@angular/core';

@Component({
  selector: 'app-flight-list',
  standalone: true,
  imports: [],
  templateUrl: './flight-list.component.html',
  styleUrl: './flight-list.component.css'
})
export class FlightListComponent implements OnInit  {
  flights: Flight[] = [];

  ngOnInit(): void {
    // Example hardcoded flight data
    this.flights = [
      { flightNumber: 'Flight 101', date: '2024-10-26', destination: 'New York' },
      { flightNumber: 'Flight 202', date: '2024-10-27', destination: 'Los Angeles' },
      { flightNumber: 'Flight 303', date: '2024-10-28', destination: 'Chicago' },
    ];
  }
}
