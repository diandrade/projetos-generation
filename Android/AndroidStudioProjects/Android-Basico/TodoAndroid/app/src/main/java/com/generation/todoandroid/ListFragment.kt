package com.generation.todoandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.todoandroid.adapter.TarefaAdapter
import com.generation.todoandroid.databinding.FragmentListBinding
import com.generation.todoandroid.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {

    private  lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater, container, false)

        val listTarefas = listOf(
            Tarefa(
                "Lavar a louça",
                "Lavar a louça do dia todo",
                "Diego",
                "2022-05-15",
                false,
                "Dia a Dia"
            ),
            Tarefa(
                "Ir ao cinema",
                "Assistir Sonic 2",
                "Amanda",
                "2022-05-18",
                false,
                "Lazer"
            ),
            Tarefa(
                "Ir ao parque",
                "Visitar o parque Ibirapuera com os amigos",
                "Vinicius",
                "2022-05-13",
                true,
                "Lazer"
            ),


        )

        //Config RecyclerView
        val adapter = TarefaAdapter()
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)

        adapter.setList(listTarefas)

        binding.floatingAdd.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }

        binding.recyclerTarefa

        return binding.root
    }
}