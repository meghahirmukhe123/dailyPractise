import express from "express";
import {WebSocketServer} from "ws";


//create app
const app = express();

//setup port to 8080
const port = 8080;

//app.listen is returning instance of server which we have stored in "server" variable.
const server = app.listen(port, ()=>
{
    console.log("Server started...");
})


//we need above server instance for reason where we want to run http server and websocket server on same port.

//creating web socket server
//we can run websocket server on different port by chaning below line to const wss = new webScoketServer({ port : diff_port_no. });
const wss = new WebSocketServer({ server });   

wss.on("connection",(ws) =>
{
    ws.on("message", (data) =>{
        console.log("Data from client %s: ",data);
        ws.send("thanks buddy!");

})

})
