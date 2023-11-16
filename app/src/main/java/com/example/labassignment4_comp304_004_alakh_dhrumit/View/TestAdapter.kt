package com.example.labassignment4_comp304_004_alakh_dhrumit.View

// TestAdapter.kt
import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.labassignment4_comp304_004_alakh_dhrumit.R

class TestAdapter(private val activity: Activity, val testList: List<Test>) : RecyclerView.Adapter<TestAdapter.TestViewHolder>() {

    class TestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val testName: TextView = itemView.findViewById(R.id.textViewTestName)
        val testResult: TextView = itemView.findViewById(R.id.textViewTestResult)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.test_card_item, parent, false)
        return TestViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        val currentItem = testList[position]

        holder.testName.text = currentItem.testName
        holder.testResult.text = currentItem.testResult


        holder.itemView.setOnClickListener{

            // TODO: Somehow get the test id from card and pass it to next activity

            onItemClick()

        }
    }

    private fun onItemClick() {
        val intent = Intent(activity, ViewTest::class.java)
        activity.startActivity(intent)
    }

    override fun getItemCount(): Int {
        return testList.size
    }
}
