import { Injectable } from '@angular/core';

let SockJs = require("sockjs-client");
let Stomp = require("stompjs");

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  public connect() {
    let socket = new SockJs(`http://localhost:8080/socket`);

    let stompClient = Stomp.over(socket);

    return stompClient;
}
  constructor() { }
}
