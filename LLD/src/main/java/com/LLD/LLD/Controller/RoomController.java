package com.LLD.LLD.Controller;

import com.LLD.LLD.Model.Room;
import com.LLD.LLD.Service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private IRoomService roomService;

    @PostMapping("/save")
    public ResponseEntity<?> addRoom(@RequestBody Room room) {
        Room newRoom = roomService.addRoom(room);
        return new ResponseEntity<>(newRoom, HttpStatus.CREATED);
    }

    @GetMapping("/get/{roomID}")
    public ResponseEntity<?> getRoomByID(@PathVariable Integer roomID) {
        Room room = roomService.getRoom(roomID);
        return new ResponseEntity<>(room, HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getRooms() {
        List<Room> rooms = roomService.getRooms();
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }

    @PutMapping("/update/{roomID}")
    public ResponseEntity<?> updateRoom(@PathVariable Integer roomID, @RequestBody Room updatedRoom) {
        Room room = roomService.updateRoom(roomID, updatedRoom);
        return new ResponseEntity<>(room, HttpStatus.FOUND);
    }

    @DeleteMapping("/delete/{roomID}")
    public ResponseEntity<?> deleteRoom(@PathVariable Integer roomID) {
        roomService.deleteRoom(roomID);
        return new ResponseEntity<>("Room Deleted Successfully", HttpStatus.OK);
    }

}
