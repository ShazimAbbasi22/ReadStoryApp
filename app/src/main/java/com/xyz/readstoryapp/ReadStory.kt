package com.xyz.readstoryapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReadStory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read_story)
        supportActionBar!!.hide()
        val btnback = findViewById<Button>(R.id.BtnBack)
        val txttitle = findViewById<TextView>(R.id.TxtTitle)
        val imagetitle = findViewById<ImageView>(R.id.ImageTitle)
        val txtstory = findViewById<TextView>(R.id.TxtStory)
        btnback.setOnClickListener {
            val ca = Intent(applicationContext, MainActivity::class.java)
            startActivity(ca)
        }
        val extras: Bundle? = intent.extras
        val story: String?
        if (extras != null) {
            story = extras.getString("keystory")
            when (story) {
                "storyA" -> {
                    txttitle.text = getString(R.string.the_boy_who_cried_wolf)
                    imagetitle.setImageResource(R.drawable.wolf)
                    txtstory.text =
                        "Once, there was a boy who became bored when he watched over the village sheep grazing on the hillside. To entertain himself, he sang out, “Wolf! Wolf! The wolf is chasing the sheep!”  When the villagers heard the cry, they came running up the hill to drive the wolf away. But, when they arrived, they saw no wolf. The boy was amused when seeing their angry faces.  “Don’t scream wolf, boy,” warned the villagers, “when there is no wolf!” They angrily went back down the hill.  Later, the shepherd boy cried out once again, “Wolf! Wolf! The wolf is chasing the sheep!” To his amusement, he looked on as the villagers came running up the hill to scare the wolf away.  As they saw there was no wolf, they said strictly, “Save your frightened cry for when there really is a wolf! Don’t cry ‘wolf’ when there is no wolf!” But the boy grinned at their words while they walked grumbling down the hill once more.  Later, the boy saw a real wolf sneaking around his flock. Alarmed, he jumped on his feet and cried out as loud as he could, “Wolf! Wolf!” But the villagers thought he was fooling them again, and so they didn’t come to help.  At sunset, the villagers went looking for the boy who hadn’t returned with their sheep. When they went up the hill, they found him weeping.  “There really was a wolf here! The flock is gone! I cried out, ‘Wolf!’ but you didn’t come,” he wailed.  An old man went to comfort the boy. As he put his arm around him, he said, “Nobody believes a liar, even when he is telling the truth!”"
                }

                "storyB" -> {
                    txttitle.text = getString(R.string.the_golden_touch)
                    imagetitle.setImageResource(R.drawable.queen)
                    txtstory.text =
                        "There once was a king named Midas who did a good deed for a Satyr. And he was then granted a wish by Dionysus, the god of wine. For his wish, Midas asked that whatever he touched would turn to gold. Despite Dionysus’ efforts to prevent it, Midas pleaded that this was a fantastic wish, and so, it was bestowed. Excited about his newly-earned powers, Midas started touching all kinds of things, turning each item into pure gold. But soon, Midas became hungry. As he picked up a piece of food, he found he couldn’t eat it. It had turned to gold in his hand. Hungry, Midas groaned, “I’ll starve! Perhaps this was not such an excellent wish after all!” Seeing his dismay, Midas’ beloved daughter threw her arms around him to comfort him, and she, too, turned to gold. “The golden touch is no blessing,” Midas cried."
                }

                "storyC" -> {
                    txttitle.text = getString(R.string.the_fox_and_the_grapes)
                    imagetitle.setImageResource(R.drawable.fox)
                    txtstory.text =
                        "One day, a fox became very hungry as he went to search for some food. He searched high and low, but couldn’t find something that he could eat. Finally, as his stomach rumbled, he stumbled upon a farmer’s wall. At the top of the wall, he saw the biggest, juiciest grapes he’d ever seen. They had a rich, purple color, telling the fox they were ready to be eaten. To reach the grapes, the fox had to jump high in the air. As he jumped, he opened his mouth to catch the grapes, but he missed. The fox tried again but missed yet again. He tried a few more times but kept failing. Finally, the fox decided it was time to give up and go home. While he walked away, he muttered, “I’m sure the grapes were sour anyway.”"
                }

                "storyD" -> {
                    txttitle.text = getString(R.string.the_proud_rose)
                    imagetitle.setImageResource(R.drawable.rose)
                    txtstory.text =
                        "Once upon a time, in a desert far away, there was a rose who was so proud of her beautiful looks. Her only complaint was growing next to an ugly cactus. Every day, the beautiful rose would insult and mock the cactus on his looks, all while the cactus remained quiet. All the other plants nearby tried to make the rose see sense, but she was too swayed by her own looks. One scorching summer, the desert became dry, and there was no water left for the plants. The rose quickly began to wilt. Her beautiful petals dried up, losing their lush color. Looking to the cactus, she saw a sparrow dip his beak into the cactus to drink some water. Though ashamed, the rose asked the cactus if she could have some water. The kind cactus readily agreed, helping them both through the tough summer, as friends."
                }

                "storyE" -> {
                    txttitle.text = getString(R.string.the_milkmaid_and_her_pail)
                    imagetitle.setImageResource(R.drawable.chicks)
                    txtstory.text =
                        "One day, Molly the milkmaid had filled her pails with milk. Her job was to milk the cows, and then bring the milk to the market to sell. Molly loved to think about what to spend her money on. As she filled the pails with milk and went to market, she again thought of all the things she wanted to buy. As she walked along the road, she thought of buying a cake and a basket full of fresh strawberries. A little further down the road, she spotted a chicken. She thought, “With the money I get from today, I’m going to buy a chicken of my own. That chicken will lay eggs, then I will be able to sell milk and eggs and get more money!” She continued, “With more money, I will be able to buy a fancy dress and make all the other milkmaids jealous. Out of excitement, Molly started skipping, forgetting about the milk in her pails. Soon, the milk started spilling over the edges, covering Molly. Drenched, Molly said to herself, “Oh no! I will never have enough money to buy a chicken now. She went home with her empty pails.Oh, my goodness! What happened to you? Molly’s mother asked. I was too busy dreaming about all the things I wanted to buy that I forgot about the pails, she answered.“Oh, Molly, my dear. How many times do I need to say, ‘Don’t count your chickens until they hatch?"
                }
            }
        }
    }
}