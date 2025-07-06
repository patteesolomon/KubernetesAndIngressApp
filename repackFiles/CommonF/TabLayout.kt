package org.example.project

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Top
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.Placeable.PlacementScope
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.LayoutDirection

public class TabMeasurements : MeasurePolicy{
    @Composable
    fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
        alignmentLines: Map<AlignmentLine, Int>,
        placementB: PlacementScope
    ): MeasureResult {
        return layout(
            12, 4, alignmentLines,
            placementBlock = {
                var al = Top.align(10, 2);
                var layoutD = LayoutDirection.Ltr;
                var xe = placementB.coordinates;
                var x = measurables[0];
                var y = measurables[1];
                var cons = constraints.maxWidth
                // placementblock values go here
                return@layout
            }
        )
    }

    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints
    ): MeasureResult {
        // todo
        TODO();
    }

}

@Composable
fun TabLayout(){
    var alignTab = Top.align(10,4);
    var layoutD = LayoutDirection.Ltr;
    Column {
        Text(text = "Command")
        Text(text = "Connection")
        Text(text = "DataBase")
        Text(text = "Config")
    }
}
