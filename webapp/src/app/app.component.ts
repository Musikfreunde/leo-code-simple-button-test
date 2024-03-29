import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  constructor(private http: HttpClient) {}
  title = 'my-first-project';
  click(){
    this.http.get("http://localhost:8080/angular/helloworld").subscribe(() => console.log("clicked"));
  }

}

