import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class UserComponent implements OnInit {
 userDetails;
  id: string;
  customerDetails: any;
  constructor(private route: ActivatedRoute) {
    this.route.params.subscribe(data => {
      console.log(data);
      this.id = data.id;
    });
    this.route.queryParams.subscribe( data => {
      console.log(data);
      this.customerDetails = data;
    });
  }

  ngOnInit() {
  }
}
