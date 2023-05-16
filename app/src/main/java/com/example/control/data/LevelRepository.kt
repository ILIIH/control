package com.example.control.data

import android.util.Log

val levels = listOf<Level>(
    Level(
        dialog1 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "Hello, here it is",
                phrasesBorderGuard = "Good afternoon sir, documents please",
            ),
            DialogUnit(
                phrasesPerson = "...",
                phrasesBorderGuard = "Thanks",
            ),
            DialogUnit(
                phrasesPerson = "I want to be reunited with my brother who seems to be living in Taiwan now.",
                phrasesBorderGuard = "The aim of border crossing",
            ),
            DialogUnit(
                phrasesPerson = "...",
                phrasesBorderGuard = "Ok, wait a second, i need to check yours documents",
            ),
        ),
        idPhoto = "livey",
        roomPhoto = "livey_inroom",
        nationality = "Chinese",
        passportNo = "SE2234123300",
        dateOfBirth = "03 MAY 1970",
        dateOfExpiry = "09 JUN 2025",
        placeOfBirth = "Chungani",
        Sex = "Man",
        FullName = "LI VEY",
        Signature = "Livey",
        IdString = "SE2234123300<<<<<<<<<<<Chungani<<<<<<",
        Bio = "Li Wei had heard stories about how difficult it was to cross the border from China to Taiwan. The two countries have been separated for decades and tensions have been high. The border was heavily guarded, and the process of obtaining a visa to Taiwan was complicated and lengthy.\n" +
            "But Li Wei was determined to cross the border, no matter what obstacles he faced. He spent months preparing for the trip, studying maps, learning about Taiwanese culture and customs, and practicing his Mandarin so he could communicate effectively with the people he met along the way.\n" +
            "Finally, the day came for Li Wei to set off on his journey. He traveled by train and bus, crossing several provinces in China before reaching the border. As he approached the checkpoint, his heart pounded with foreboding and fear",
        AdditionalQuestionDialog1 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "The fact is that when we parted, he lived with his father ",
                phrasesBorderGuard = "Why do you think your brother is in Taiwan?",
            ),
            DialogUnit(
                phrasesPerson = "My father very often talked about Taiwan",
                phrasesBorderGuard = "...",
            ),
            DialogUnit(
                phrasesPerson = "And the steelworks street where he spent all his childhood",
                phrasesBorderGuard = "...",
            ),
        ),
        AdditionalQuestionDialog2 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "Where are you work ?",
                phrasesBorderGuard = "In Global Texh",
            ),
        ),
        AdditionalQuestionDialog3 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "What is your favourite dish ?",
                phrasesBorderGuard = "Spaghetti",
            ),
        ),
        AdditionalQuestionDialog4 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "What year did you born ?",
                phrasesBorderGuard = "1970",
            ),
        ),
        isItSpy = false,
        whyItSpyDescription = "-",
        dangerBeingKilledBy = 20,
        dangerLitigation = 30,
    ),

    Level(
        dialog1 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "Good morning",
                phrasesBorderGuard = "Good morning miss, documents please",
            ),
            DialogUnit(
                phrasesPerson = "Here it is",
                phrasesBorderGuard = "Thanks",
            ),
            DialogUnit(
                phrasesPerson = "I'm on my way to meet Mr. Wei",
                phrasesBorderGuard = "The aim of border crossing",
            ),
            DialogUnit(
                phrasesPerson = "...",
                phrasesBorderGuard = "Ok, wait a second, i need to check yours documents",
            ),
        ),
        idPhoto = "megi",
        roomPhoto = "megi_inroom",
        nationality = "American",
        passportNo = "SV2230023300",
        dateOfBirth = "23 JUN 1988",
        dateOfExpiry = "09 JUN 2035",
        placeOfBirth = "Taibei",
        Sex = "Woman",
        FullName = "Maggie Steward",
        Signature = "Steward",
        IdString = "SV2230023300<<<<<<<<<<<Steward<<<<<<",
        Bio = "Maggie was a woman with bright red hair and only one dragon tattoo that covered her right arm. She lived a life full of adventure, traveling the world and experiencing all it had to offer. Today she wants to cross the border from China to Taiwan.\n" +
            "\n" +
            "Maggie had heard stories about the beauty of Taiwan, and she had always dreamed of visiting the island nation. But there was another reason why she wanted to make this trip. Many years ago, Maggie fell in love with a Taiwanese man named Wei. They had a passionate affair, but their relationship ended when the Wei family forced him to marry someone else.\n" +
            "\n" +
            "Maggie never forgot Way and always hoped that one day she would find him again. And so, in her old age, she decided to travel to Taiwan to try to find him.\n" +
            "\n" +
            "Maggie packed her bags and set off on a journey, traveling by train and bus through the Chinese countryside.",
        AdditionalQuestionDialog1 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "Once i had. I got robbed. ",
                phrasesBorderGuard = "Did you have any connections with Chienese police",
            ),
            DialogUnit(
                phrasesPerson = "Chinese stole my passport",
                phrasesBorderGuard = "...",
            ),
            DialogUnit(
                phrasesPerson = "They didn`t find robber",
                phrasesBorderGuard = "...",
            ),
        ),
        AdditionalQuestionDialog2 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "Where are you work ?",
                phrasesBorderGuard = "Current i am at freelance",
            ),
        ),
        AdditionalQuestionDialog3 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "When you renewed yours ID ? ",
                phrasesBorderGuard = "In march 2020",
            ),
        ),
        AdditionalQuestionDialog4 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "What kind of tattoos do you have",
                phrasesBorderGuard = "i have a lot of Flower tattoos as you can see on my arm and nek, nothings else ",
            ),
        ),
        isItSpy = true,
        whyItSpyDescription = "She lied about the number of tattoos, and also she has a passport that expires until 2035, and the maximum passport can be renewed for 10 years, that is, until 2030",
        dangerBeingKilledBy = 5,
        dangerLitigation = 0,
    ),

    Level(
        dialog1 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "Good evening",
                phrasesBorderGuard = "Good evening sir, documents please",
            ),
            DialogUnit(
                phrasesPerson = "Here it is",
                phrasesBorderGuard = "Thanks",
            ),
            DialogUnit(
                phrasesPerson = "I'm on my way to meet my sister she is sick",
                phrasesBorderGuard = "The aim of border crossing",
            ),
            DialogUnit(
                phrasesPerson = "...",
                phrasesBorderGuard = "Ok, wait a second, i need to check yours documents",
            ),
        ),
        idPhoto = "johnathan",
        roomPhoto = "johnathan_inroom",
        nationality = "American",
        passportNo = "SA000023300",
        dateOfBirth = "23 JUN 1951",
        dateOfExpiry = "09 JUN 2030",
        placeOfBirth = "San Antonio",
        Sex = "Man",
        FullName = "Johnathan Whited",
        Signature = "Whited",
        IdString = "SA000023300<<<<<<<<<<<Johnathan<<<<<<",
        Bio = "Johnathan White was a distinguished gentleman with a signature white mustache that had become his trademark. Born in the mid-1950s in a small town in Texas, Johnathan grew up with a deep appreciation for hard work and honesty. After completing his education, he joined the US military and served his country with honor and distinction for over 20 years.\n" +
            "\n" +
            "After retiring from the military, Johnathan settled in a small town in Arizona and started a small business that specialized in importing and exporting goods. His business thrived, and Johnathan became known in the community as an honest and reliable businessman.\n" +
            "\n" +
            "However, Johnathan's life took an unexpected turn when he received news that his estranged daughter, who had been living in Taiwan for several years, was seriously ill and needed his help. Without hesitation, Johnathan packed his bags and crossed the border into Taiwan.\n",
        AdditionalQuestionDialog1 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "Yes. ",
                phrasesBorderGuard = "Is it your firs visit to Taiwan",
            ),
        ),
        AdditionalQuestionDialog2 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "What is your sister name ?",
                phrasesBorderGuard = "Mikasa",
            ),
        ),
        AdditionalQuestionDialog3 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "When you renewed yours ID ? ",
                phrasesBorderGuard = "In judiciary 2020",
            ),
        ),
        AdditionalQuestionDialog4 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "Where your sister is treating",
                phrasesBorderGuard = "Taipey Medical University ",
            ),
        ),
        isItSpy = false,
        whyItSpyDescription = "",
        dangerBeingKilledBy = 30,
        dangerLitigation = 0,
    ),

    Level(
        dialog1 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "Good evening",
                phrasesBorderGuard = "Good evening sir, documents please",
            ),
            DialogUnit(
                phrasesPerson = "Here it is",
                phrasesBorderGuard = "Thanks",
            ),
            DialogUnit(
                phrasesPerson = "I'm on my way to continue my science research path",
                phrasesBorderGuard = "The aim of border crossing",
            ),
            DialogUnit(
                phrasesPerson = "...",
                phrasesBorderGuard = "Ok, wait a second, i need to check yours documents",
            ),
        ),
        idPhoto = "vei_chang",
        roomPhoto = "vei_chang_inroom",
        nationality = "Chinese",
        passportNo = "SMM022023300",
        dateOfBirth = "23 JUN 1972",
        dateOfExpiry = "09 JUN 2027",
        placeOfBirth = "Leshan",
        Sex = "Man",
        FullName = "Wei Zhang",
        Signature = "Whited",
        IdString = "SMM022023300<<<<<<<<<<<Zhang<<<<<<",
        Bio = "Dr. Wei Zhang was a renowned scientist from China who had made significant contributions to the field of renewable energy. He was born in the late 1970s in a small town in the province of Sichuan. From a young age, Wei showed a keen interest in science and technology. He went on to study physics at one of China's top universities, where he earned his PhD.\n" +
            "\n" +
            "After completing his doctoral studies, Wei began working for a leading energy company in China. He quickly rose through the ranks and became known for his innovative research in renewable energy. His work caught the attention of industry experts around the world, and he was invited to speak at conferences and seminars in Europe and the United States.\n" +
            "\n" +
            "Despite his success, Wei was frustrated by the restrictions placed on scientific research in China. He longed for the freedom to pursue his research without censorship or government interference. One day, he received an unexpected invitation to speak at a conference in Taiwan.\n" +
            "\n" +
            "At first, Wei was hesitant to accept the invitation. He knew that crossing the border into Taiwan could be risky, and he was concerned about the potential consequences. However, after much consideration, he decided to take the chance.",
        AdditionalQuestionDialog1 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "Yes. ",
                phrasesBorderGuard = "Is it your firs visit to Taiwan",
            ),
        ),
        AdditionalQuestionDialog2 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "What is your research Field?",
                phrasesBorderGuard = "Electronics",
            ),
        ),
        AdditionalQuestionDialog3 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "What university you will join in Taiwan ? ",
                phrasesBorderGuard = "National Taowan University",
            ),
        ),
        AdditionalQuestionDialog4 = listOf<DialogUnit>(
            DialogUnit(
                phrasesPerson = "Do you love China",
                phrasesBorderGuard = "Not, at all ",
            ),
        ),
        isItSpy = false,
        whyItSpyDescription = "",
        dangerBeingKilledBy = 0,
        dangerLitigation = 20,
    ),
)

class LevelRepository {
    private var currentLevelId = 0
    fun returnAllLevel() = levels
    fun getLevelById(id: Int) = levels[id]

    fun getCurrentLevelId() = currentLevelId

    fun setCurrentLevelId(id: Int) {
        Log.i("cur_level", "id = ${id < levels.size}")
        currentLevelId = if (id < levels.size) {
            id
        } else {
            0
        }
    }

    fun getCurrentLevel() = levels[currentLevelId]
}
