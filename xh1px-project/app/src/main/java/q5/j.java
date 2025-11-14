package q5;

import P.O;
import X6.r;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import t2.C1562a;

/* loaded from: classes.dex */
public final class j implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f14211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f14212b;

    public j(ChipGroup chipGroup) {
        this.f14212b = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f14212b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                WeakHashMap weakHashMap = O.f4214a;
                view2.setId(View.generateViewId());
            }
            r rVar = chipGroup.k;
            Chip chip = (Chip) view2;
            ((HashMap) rVar.f7037d).put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                rVar.a(chip);
            }
            chip.setInternalOnCheckedChangeListener(new C1562a(rVar));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f14211a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.f14212b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            r rVar = chipGroup.k;
            Chip chip = (Chip) view2;
            rVar.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            ((HashMap) rVar.f7037d).remove(Integer.valueOf(chip.getId()));
            ((HashSet) rVar.f7038e).remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f14211a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
