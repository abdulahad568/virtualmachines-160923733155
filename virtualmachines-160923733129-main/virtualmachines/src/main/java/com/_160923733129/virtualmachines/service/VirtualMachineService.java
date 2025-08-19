package com._160923733129.virtualmachines.service;

import com._160923733129.virtualmachines.model.VirtualMachine;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class VirtualMachineService {

    private Map<String, VirtualMachine> vmStore = new HashMap<>();

    public VirtualMachine createVM(VirtualMachine vm) {
        String id = UUID.randomUUID().toString();
        vm.setId(id);
        vmStore.put(id, vm);
        return vm;
    }

    public List<VirtualMachine> getVMs() {
        return new ArrayList<>(vmStore.values());
    }

    public VirtualMachine getVMById(String id) {
        return vmStore.get(id);
    }

    public VirtualMachine updateVM(String id, VirtualMachine vm) {
        if(vmStore.containsKey(id)) {
            vm.setId(id);
            vmStore.put(id, vm);
            return vm;
        }
        return null;
    }

    public boolean deleteVM(String id) {
        return vmStore.remove(id) != null;
    }
}
