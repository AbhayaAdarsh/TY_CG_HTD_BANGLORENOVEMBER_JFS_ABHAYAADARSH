import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-data-from-json',
  templateUrl: './data-from-json.component.html',
  styleUrls: ['./data-from-json.component.css']
})
export class DataFromJsonComponent implements OnInit {

  customer: Customer[];

  constructor( private http: HttpClient) {
    this.getDataFromJSON();
  }

  getDataFromJSON() {
    this.http.get<Customer[]>('../../assets/this.products1.json').subscribe(response => {
     console.log(response);
     this.customer = response;
    });
  }

  ngOnInit() {
  }
}
interface Customer {
    name: string ;
    image: string;
    price: number;
}

