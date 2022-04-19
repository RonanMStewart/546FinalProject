package com.example.assignment5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

const val EXTRA_MESSAGE = "com.example.assignment5.POSITION"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myRV: RecyclerView = findViewById(R.id.recyclerView)
        val commanderList = ArrayList<myData>()
        commanderList += myData(R.drawable.akiri, "Akiri, Line Slinger",
            "Gains power from artifacts",
            getString(R.string.Silas_Akiri)
        )
        commanderList += myData(R.drawable.araumi, "Araumi of the Dead Tide",
            "Gives creatures in the yard encore",
            getString(R.string.Araumi)
        )
        commanderList += myData(R.drawable.chromium, "Chromium, the Mutable",
            "Big dragon with built-in evasion and protection",
            getString(R.string.Chromium)
        )
        commanderList += myData(R.drawable.izoni, "Izoni, Thousand-Eyed",
            "Creates token and sacrifices them for card advantage",
            getString(R.string.unfinished_List)
        )
        commanderList += myData(R.drawable.lazav, "Lazav, the Multifarious",
            "Acts as a copy of a creature in the graveyard",
            getString(R.string.Lazav)
        )
        commanderList += myData(R.drawable.marath, "Marath, Will of the Wild",
            "Manipulates +1/+1 counters in numerous ways",
            getString(R.string.Marath)
        )
        commanderList += myData(R.drawable.osgir, "Osgir, the Reconstructor",
            "Duplicates artifacts from the graveyard",
            getString(R.string.Osgir)
        )
        commanderList += myData(R.drawable.silas, "Silas Renn, Seeker Adept",
            "Recurs artifacts through combat damage",
            getString(R.string.Silas_Akiri)
        )
        commanderList += myData(R.drawable.shorikai_genesis_engine, "Shorikai, Genesis Engine",
            "Noncreature commander that generates tokens and card advantage",
            getString(R.string.Shorikai)
        )
        commanderList += myData(R.drawable.tuvasa, "Tuvasa the Sunlit",
            "Draws cards and gains power from enchantments",
            getString(R.string.Tuvasa)
        )
        commanderList += myData(R.drawable.zur, "Zur the Enchanter",
            "Tutors for cheap enchantments on attack",
            getString(R.string.unfinished_List)
        )
        commanderList += myData(R.drawable.extus, "Extus, Oriq Overlord",
            "MDFC Commander that focuses on spellslinging and aristocrats",
            getString(R.string.unfinished_List)
        )

        myRV.adapter = myAdapter(commanderList)
        myRV.layoutManager = LinearLayoutManager(this)
        myRV.setHasFixedSize(true)
    }

    fun gotToDesc(v: View) {
        val intent = Intent(this, DescriptionActivity::class.java)
        startActivity(intent)
    }
}