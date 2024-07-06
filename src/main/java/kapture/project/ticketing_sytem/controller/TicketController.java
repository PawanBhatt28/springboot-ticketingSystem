//package kapture.project.ticketing_sytem.controller;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.*;
//
//import com.example.ticketapi.model.Ticket;
//import com.example.ticketapi.service.TicketService;
//import com.example.ticketapi.validation.TicketValidator;
//
//import javax.validation.Valid;
//import java.time.LocalDateTime;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/tickets")
//public class TicketController {
//
//    @Autowired
//    private TicketService ticketService;
//
//    @Autowired
//    private TicketValidator ticketValidator;
//
//    @InitBinder
//    protected void initBinder(WebDataBinder binder) {
//        binder.setValidator(ticketValidator);
//    }
//
////    @GetMapping
////    public ResponseEntity<Page<Ticket>> getAllTickets(Pageable pageable) {
////        // Here you can add validation for pagination parameters if needed
////        Page<Ticket> tickets = ticketService.getAllTickets(pageable);
////        return ResponseEntity.ok(tickets);
////    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<?> getTicket(@PathVariable Integer id) {
//        if (id == null || id <= 0) {
//            return ResponseEntity.badRequest().body("Invalid ticket ID.");
//        }
//
//        Optional<Ticket> ticket = ticketService.getTicket(id);
//        if (ticket.isPresent()) {
//            return ResponseEntity.ok(ticket.get());
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @PostMapping
//    public ResponseEntity<?> addOrUpdateTicket(@Valid @RequestBody Ticket ticket, BindingResult bindingResult) {
//        // Set the last modified date
//        ticket.setLastModifiedDate(LocalDateTime.now());
//
//        // Validate the ticket
//        ticketValidator.validate(ticket, bindingResult);
//
//        // Check for validation errors
//        if (bindingResult.hasErrors()) {
//            return ResponseEntity.badRequest().body(bindingResult.getAllErrors());
//        }
//
//        // Save the ticket using the service layer
//        Ticket savedTicket = ticketService.addOrUpdateTicket(ticket);
//        return ResponseEntity.ok(savedTicket);
//    }
//}
