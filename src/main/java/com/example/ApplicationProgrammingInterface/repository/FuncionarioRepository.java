package com.example.ApplicationProgrammingInterface.repository;

import com.example.ApplicationProgrammingInterface.funcionarios.FuncionarioApi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<FuncionarioApi,Long> {

}
