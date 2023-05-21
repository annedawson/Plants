package net.annedawson.plants.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import net.annedawson.plants.R

/**
 * A data class to represent the information presented in the plant card
 */
data class Plant(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val summary: Int,
    @StringRes val details: Int
)

val plants = listOf(
    Plant(R.drawable.basil,R.string.plant_name_1,R.string.plant_summary_1,R.string.plant_details_1),
    Plant(R.drawable.beets,R.string.plant_name_2,R.string.plant_summary_2,R.string.plant_details_2),
    Plant(R.drawable.broccoli,R.string.plant_name_3,R.string.plant_summary_3,R.string.plant_details_3),
    Plant(R.drawable.cantaloupe,R.string.plant_name_4,R.string.plant_summary_4,R.string.plant_details_4),
    Plant(R.drawable.carrots,R.string.plant_name_5,R.string.plant_summary_5,R.string.plant_details_5),
    Plant(R.drawable.celery,R.string.plant_name_6,R.string.plant_summary_6,R.string.plant_details_6),
    Plant(R.drawable.chives,R.string.plant_name_7,R.string.plant_summary_7,R.string.plant_details_7),
    Plant(R.drawable.cilantro,R.string.plant_name_8,R.string.plant_summary_8,R.string.plant_details_8),
    Plant(R.drawable.cucumbers,R.string.plant_name_9,R.string.plant_summary_9,R.string.plant_details_9),
    Plant(R.drawable.fig,R.string.plant_name_10,R.string.plant_summary_10,R.string.plant_details_10),
    Plant(R.drawable.garlic,R.string.plant_name_11,R.string.plant_summary_11,R.string.plant_details_11),
    Plant(R.drawable.grapes,R.string.plant_name_12,R.string.plant_summary_12,R.string.plant_details_12),
    Plant(R.drawable.kale,R.string.plant_name_13,R.string.plant_summary_13,R.string.plant_details_13),
    Plant(R.drawable.kiwi,R.string.plant_name_14,R.string.plant_summary_14,R.string.plant_details_14),
    Plant(R.drawable.lavender,R.string.plant_name_15,R.string.plant_summary_15,R.string.plant_details_15),
    Plant(R.drawable.lettuce,R.string.plant_name_16,R.string.plant_summary_16,R.string.plant_details_16),
    Plant(R.drawable.lovage,R.string.plant_name_17,R.string.plant_summary_17,R.string.plant_details_17),
    Plant(R.drawable.nasturtium,R.string.plant_name_18,R.string.plant_summary_18,R.string.plant_details_18),
    Plant(R.drawable.onions,R.string.plant_name_19,R.string.plant_summary_19,R.string.plant_details_19),
    Plant(R.drawable.parsley,R.string.plant_name_20,R.string.plant_summary_20,R.string.plant_details_20),
    Plant(R.drawable.parsnips,R.string.plant_name_21,R.string.plant_summary_21,R.string.plant_details_21),
    Plant(R.drawable.peas,R.string.plant_name_22,R.string.plant_summary_22,R.string.plant_details_22),
    Plant(R.drawable.potato,R.string.plant_name_23,R.string.plant_summary_23,R.string.plant_details_23),
    Plant(R.drawable.radish,R.string.plant_name_24,R.string.plant_summary_24,R.string.plant_details_24),
    Plant(R.drawable.rhubarb,R.string.plant_name_25,R.string.plant_summary_25,R.string.plant_details_25),
    Plant(R.drawable.spinach,R.string.plant_name_26,R.string.plant_summary_26,R.string.plant_details_26),
    Plant(R.drawable.squashspaghetti,R.string.plant_name_27,R.string.plant_summary_27,R.string.plant_details_27),
    Plant(R.drawable.squashwinter,R.string.plant_name_28,R.string.plant_summary_28,R.string.plant_details_28),
    Plant(R.drawable.swisschard,R.string.plant_name_29,R.string.plant_summary_29,R.string.plant_details_29),
    Plant(R.drawable.thyme,R.string.plant_name_30,R.string.plant_summary_30,R.string.plant_details_30),
    Plant(R.drawable.tomato,R.string.plant_name_31,R.string.plant_summary_31,R.string.plant_details_31),
    Plant(R.drawable.vinca,R.string.plant_name_32,R.string.plant_summary_32,R.string.plant_details_32),
    Plant(R.drawable.zucchini,R.string.plant_name_33,R.string.plant_summary_33,R.string.plant_details_33)
)
