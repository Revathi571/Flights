import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FlightsService {
private apiUrl= environment.apiUrl
  constructor(private flightService :RestService) {
    super();
   }


@TrackRestCallOrogress(){
  public searchflightinfo(
    request:FlightModel,):observable<BaseResponse<FlightModel>>{
      return this.restservice.post('${this.apiUrl}/enquire/flightinfo',request )as Observable<FlightsServicebaseResonse<FlightModel>>;
    }
}
}
