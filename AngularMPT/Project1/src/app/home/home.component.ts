import { Component, OnInit, OnDestroy } from '@angular/core';
import { interval, Subscription } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit, OnDestroy {

  mySubscription: Subscription;

  constructor(private router: Router) {
    this.mySubscription = interval(1000).subscribe(data => {
      console.log(data);
    });
  }
  goToId(id, name, url) {
    this.router.navigate([`/user/${id}`], {
      queryParams: { customerName: name, customerImage: url}
    });
  }
  ngOnInit() {
  }

  ngOnDestroy() {
    this.mySubscription.unsubscribe();
  }
}
