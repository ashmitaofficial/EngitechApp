package e.ashmita.engitechapp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import e.ashmita.engitechapp.databinding.ActivityLockBinding

class LockActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLockBinding
    var digitCounter: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLockBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setPasswordListeners()

    }

    private fun setPasswordListeners() {
        binding.btn1.setOnClickListener {
            if (digitCounter < 4) {
                digitCounter++
                setDots()
            }
        }
        binding.btn2.setOnClickListener {
            if (digitCounter < 4) {
                digitCounter++
                setDots()
            }

        }
        binding.btn3.setOnClickListener {
            if (digitCounter < 4) {
                digitCounter++
                setDots()
            }

        }
        binding.btn4.setOnClickListener {
            if (digitCounter < 4) {
                digitCounter++
                setDots()
            }

        }
        binding.btn5.setOnClickListener {
            if (digitCounter < 4) {
                digitCounter++
                setDots()
            }

        }
        binding.btn6.setOnClickListener {
            if (digitCounter < 4) {
                digitCounter++
                setDots()
            }

        }
        binding.btn7.setOnClickListener {
            if (digitCounter < 4) {
                digitCounter++
                setDots()
            }

        }
        binding.btn8.setOnClickListener {
            if (digitCounter < 4) {
                digitCounter++
                setDots()
            }

        }
        binding.btn9.setOnClickListener {
            if (digitCounter < 4) {
                digitCounter++
                setDots()
            }

        }
        binding.btn0.setOnClickListener {
            if (digitCounter < 4) {
                digitCounter++
                setDots()
            }

        }
        binding.btnClear.setOnClickListener {
                digitCounter = 0
                setDots()
        }
    }

    private fun setDots() {
        if (digitCounter == 4) {
            val homeIntent = Intent(this, Homeactivity::class.java)
            startActivity(homeIntent)
            finish()
        }
        when(digitCounter) {
            1-> {
                binding.view01.setBackgroundResource(R.drawable.bg_view_grey)
                binding.view02.setBackgroundResource(R.drawable.circle)
                binding.view03.setBackgroundResource(R.drawable.circle)
                binding.view04.setBackgroundResource(R.drawable.circle)
            }
            2-> {
                binding.view01.setBackgroundResource(R.drawable.bg_view_grey)
                binding.view02.setBackgroundResource(R.drawable.bg_view_grey)
                binding.view03.setBackgroundResource(R.drawable.circle)
                binding.view04.setBackgroundResource(R.drawable.circle)
            }
            3-> {
                binding.view01.setBackgroundResource(R.drawable.bg_view_grey)
                binding.view02.setBackgroundResource(R.drawable.bg_view_grey)
                binding.view03.setBackgroundResource(R.drawable.bg_view_grey)
                binding.view04.setBackgroundResource(R.drawable.circle)
            }
            4-> {
                binding.view01.setBackgroundResource(R.drawable.bg_view_grey)
                binding.view02.setBackgroundResource(R.drawable.bg_view_grey)
                binding.view03.setBackgroundResource(R.drawable.bg_view_grey)
                binding.view04.setBackgroundResource(R.drawable.bg_view_grey)
            }
            else -> {
                binding.view01.setBackgroundResource(R.drawable.circle)
                binding.view02.setBackgroundResource(R.drawable.circle)
                binding.view03.setBackgroundResource(R.drawable.circle)
                binding.view04.setBackgroundResource(R.drawable.circle)
            }
        }
    }


}