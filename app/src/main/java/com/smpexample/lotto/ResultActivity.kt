package com.smpexample.lotto

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getIntegerArrayListExtra("result") ?: return

//        val result_sorted = result?.sortedBy{it}
        result?.Let{ 
            updateLottoBallImages(result.sortedBy{it})
        }

        val LottoImageStartId = R.drawable.ball_01
//        val LottoImageId2 = R.drawable.ball_02
//        val LottoImageId3 = R.drawable.ball_03
/*        val ImageView1 = findViewById<ImageView>(R.id.ImageView1)
        val ImageView2 = findViewById<ImageView>(R.id.ImageView2)
        val ImageView3 = findViewById<ImageView>(R.id.ImageView3)
        val ImageView4 = findViewById<ImageView>(R.id.ImageView4)
        val ImageView5 = findViewById<ImageView>(R.id.ImageView5)
        val ImageView6 = findViewById<ImageView>(R.id.ImageView6)

        ImageView1.setImageResource(LottoImageStartId + result_sorted[0] - 1)
        ImageView2.setImageResource(LottoImageStartId + result_sorted[1] - 1)
        ImageView3.setImageResource(LottoImageStartId + result_sorted[2] - 1)
        ImageView4.setImageResource(LottoImageStartId + result_sorted[3] - 1)
        ImageView5.setImageResource(LottoImageStartId + result_sorted[4] - 1)
        ImageView6.setImageResource(LottoImageStartId + result_sorted[5] - 1) */
    }
    private fun updateLottoBallImages(result_sorted : List<Int>) {
        val LottoImageStartId = R.drawable.ball_01

        val ImageView1 = findViewById<ImageView>(R.id.ImageView1)
        val ImageView2 = findViewById<ImageView>(R.id.ImageView2)
        val ImageView3 = findViewById<ImageView>(R.id.ImageView3)
        val ImageView4 = findViewById<ImageView>(R.id.ImageView4)
        val ImageView5 = findViewById<ImageView>(R.id.ImageView5)
        val ImageView6 = findViewById<ImageView>(R.id.ImageView6)

        ImageView1.setImageResource(LottoImageStartId + result_sorted[0]!! - 1)
        ImageView2.setImageResource(LottoImageStartId + result_sorted[1] - 1)
        ImageView3.setImageResource(LottoImageStartId + result_sorted[2] - 1)
        ImageView4.setImageResource(LottoImageStartId + result_sorted[3] - 1)
        ImageView5.setImageResource(LottoImageStartId + result_sorted[4] - 1)
        ImageView6.setImageResource(LottoImageStartId + result_sorted[5] - 1)
    }
}

private fun <E> ArrayList<E>.Let(function: () -> Unit) {

}


