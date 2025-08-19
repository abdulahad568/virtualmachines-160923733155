package com._160923733129.virtualmachines.controller;

import com._160923733129.virtualmachines.model.VirtualMachine;
import com._160923733129.virtualmachines.service.VirtualMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vms")
public class VirtualMachineController {

    @Autowired
    private VirtualMachineService vmService;

    @PostMapping
    public ResponseEntity<VirtualMachine> createVM(@RequestBody VirtualMachine vm) {
        return ResponseEntity.ok(vmService.createVM(vm));
    }

    @GetMapping
    public ResponseEntity<List<VirtualMachine>> getAllVMs() {
        return ResponseEntity.ok(vmService.getVMs());
    }

    @GetMapping("/{id}")
    public ResponseEntity<VirtualMachine> getVMById(@PathVariable String id) {
        VirtualMachine vm = vmService.getVMById(id);
        if(vm == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(vm);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VirtualMachine> updateVM(@PathVariable String id, @RequestBody VirtualMachine vm) {
        VirtualMachine updated = vmService.updateVM(id, vm);
        if(updated == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVM(@PathVariable String id) {
        if(vmService.deleteVM(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
