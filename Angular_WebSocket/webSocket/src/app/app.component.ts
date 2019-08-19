import { Component } from '@angular/core';
import {ServiceService} from './service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webSocket';
  messages: any;

// tslint:disable-next-line: no-shadowed-variable
constructor(private ServiceService: ServiceService){
  const stompClient = this.ServiceService.connect();
  stompClient.connect({}, frame => {
            stompClient.subscribe('/websocket/', messages => {

                this.messages = JSON.parse(messages.body).count;
            });
        });
}
}
