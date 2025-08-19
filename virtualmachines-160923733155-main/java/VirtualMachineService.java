package com._160923733155.virtualmachines.service;

import com._160923733155.virtualmachines.model.VirtualMachine;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Virtual Machine Service Layer
 * Business logic for managing virtual machines
 * 
 * @author abdul ahad
 * @studentId 160923733155
 * @version 1.0
 */
@Service
public class VirtualMachineService {

    private Map<String, VirtualMachine> vmStore = new HashMap<>();
    private final String AUTHOR = "abdul ahad";
    private final String PROJECT_ID = "160923733155";

    public VirtualMachineService() {
        System.out.println("VirtualMachineService initialized by " + AUTHOR);
        System.out.println("Project ID: " + PROJECT_ID);
    }

    /**
     * Create a new virtual machine
     * @param vm VirtualMachine object to create
     * @return Created VirtualMachine with generated ID
     */
    public VirtualMachine createVM(VirtualMachine vm) {
        String id = UUID.randomUUID().toString();
        vm.setId(id);
        vm.setCreatedBy(AUTHOR);
        vm.setProjectId(PROJECT_ID);
        vmStore.put(id, vm);
        System.out.println("VM created with ID: " + id + " by " + AUTHOR);
        return vm;
    }

    /**
     * Get all virtual machines
     * @return List of all VirtualMachine objects
     */
    public List<VirtualMachine> getVMs() {
        System.out.println("Retrieving " + vmStore.size() + " VMs from project " + PROJECT_ID);
        return new ArrayList<>(vmStore.values());
    }

    /**
     * Get virtual machine by ID
     * @param id VM identifier
     * @return VirtualMachine object or null if not found
     */
    public VirtualMachine getVMById(String id) {
        VirtualMachine vm = vmStore.get(id);
        if (vm != null) {
            System.out.println("Retrieved VM: " + id + " from project by " + AUTHOR);
        }
        return vm;
    }

    /**
     * Update virtual machine
     * @param id VM identifier
     * @param vm Updated VirtualMachine object
     * @return Updated VirtualMachine or null if not found
     */
    public VirtualMachine updateVM(String id, VirtualMachine vm) {
        if(vmStore.containsKey(id)) {
            vm.setId(id);
            vm.setCreatedBy(AUTHOR);
            vm.setProjectId(PROJECT_ID);
            vmStore.put(id, vm);
            System.out.println("VM updated: " + id + " by " + AUTHOR);
            return vm;
        }
        System.out.println("VM not found for update: " + id);
        return null;
    }

    /**
     * Delete virtual machine
     * @param id VM identifier
     * @return true if deleted, false if not found
     */
    public boolean deleteVM(String id) {
        boolean removed = vmStore.remove(id) != null;
        if (removed) {
            System.out.println("VM deleted: " + id + " from project " + PROJECT_ID);
        } else {
            System.out.println("VM not found for deletion: " + id);
        }
        return removed;
    }

    /**
     * Get total count of VMs
     * @return Number of VMs in the system
     */
    public int getVMCount() {
        return vmStore.size();
    }
}