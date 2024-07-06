package kapture.project.ticketing_sytem.controller;

import kapture.project.ticketing_sytem.dto.ResponseDto;
import kapture.project.ticketing_sytem.dto.TicketDto;
import kapture.project.ticketing_sytem.entity.Ticket;
import kapture.project.ticketing_sytem.service.TicketService;
import kapture.project.ticketing_sytem.validation.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

public class TicketController2 {

    @Autowired
    TicketService ticketService;
    @Autowired
    Validation validation;
    @Autowired
    ResponseDto responseDto;

    // "all" "single" "mutliple" "error"
    @GetMapping("/searchTicket")
    public ResponseDto searchTicket(@RequestBody TicketDto ticketDto) {
        // 1. Fetch all tickets
            // if everything is null we'll send all the tickets.
            // else "any below should follow"
        // 2. Fetch single tickets
            // if CId & TId exists and all other fields are not present.
            // else "Error"
        // 3. Fetch multiple tickets
            // Both Cid and TId should not be given
            // Create the query based on Cid+Tid+Title+Status+Limit
        // 4. None
            // error
        responseDto = validation.fetchTicketValidator(ticketDto);
        ticketService.searchTickets(responseDto);
    }


//    public ResponseEntity<List<Ticket>> getAllTickets() throws Exception {
//        List<Ticket> allTickets;
//        try{
//            allTickets = ticketService.getAllTickets();
//        }
//        catch(Error e){
//
//        }
//        return new ResponseEntity<>(allTickets, HttpStatusCode.valueOf(200));
//    }
//
//    public ResponseEntity<Ticket> getTicket(@RequestBody ) throws Exception{
//
//        try{
//            responseDto = validation.fetchTicketValidator(clientId, ticketId);
//            if(responseDto.getStatus() == "complete"){
//                ticket = ticketService.getTicket();
//            }
//        }
//        catch(Error e){
//            throw new Exception(e);
//        }
//        return new ResponseEntity<>(new Ticket(), HttpStatusCode.valueOf(200));
//    }

//    public ResponseEntity<Ticket> addTicket(@RequestBody TicketDto ticketDto){
//
//    }



}
