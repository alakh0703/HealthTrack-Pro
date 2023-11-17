package com.example.labassignment4_comp304_004_alakh_dhrumit.View

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
<<<<<<< HEAD
import com.example.labassignment4_comp304_004_alakh_dhrumit.R

class PatientAdapter(private val activity: Activity, private val patientList: List<Patient>) :
=======
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient.Patient
import com.example.labassignment4_comp304_004_alakh_dhrumit.R

class PatientAdapter(private val activity: Activity,
                     private val patientList: List<Patient>) :
>>>>>>> master
    RecyclerView.Adapter<PatientAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageViewPatient: ImageView = itemView.findViewById(R.id.imageViewPatient)
        val textViewPatientName: TextView = itemView.findViewById(R.id.textViewPatientName)
        val textViewPatientDepartment: TextView = itemView.findViewById(R.id.textViewPatientDepartment)
        val textViewPatientRoom: TextView = itemView.findViewById(R.id.textViewPatientRoom)
        // Add references for other views as needed
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.patient_card_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentPatient = patientList[position]

        // Set data to views
        holder.imageViewPatient.setImageResource(R.drawable.dhrumit) // Set actual patient image
<<<<<<< HEAD
        holder.textViewPatientName.text = "${currentPatient.firstname} ${currentPatient.lastname}"
=======
        holder.textViewPatientName.text = "${currentPatient.firstName} ${currentPatient.lastName}"
>>>>>>> master
        holder.textViewPatientDepartment.text = "Department: ${currentPatient.department}"
        holder.textViewPatientRoom.text = "Room: ${currentPatient.room}"

        holder.itemView.setOnClickListener {
            // TODO: Somehow get the patient id of the card clicked
<<<<<<< HEAD
            onItemClick(currentPatient.patientId)
=======
            onItemClick((currentPatient.patientId).toInt())
>>>>>>> master
        }
        // Set other data to other views as needed
    }

    private fun onItemClick(patientId: Int) {

        val intent = Intent(activity, ViewPatient::class.java)
        intent.putExtra("patientId", patientId)
        activity.startActivity(intent)
    }

    override fun getItemCount(): Int {
        return patientList.size
    }
}
