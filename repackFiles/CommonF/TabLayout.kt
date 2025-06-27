package org.example.project

import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.LayoutDirection

public class TabMeasurements : MeasurePolicy{
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints
    ): MeasureResult {
        TODO("Not yet implemented")
    }

}

public class TabLayout {
    var alignTab = Alignment.Top.align(10,4);
    var layoutD = LayoutDirection.Ltr;
    var textContent = "Commands";
}