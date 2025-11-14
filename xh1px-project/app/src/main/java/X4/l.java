package X4;

import a5.EnumC0424h;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import n6.InterfaceC1163b;
import t0.s0;

/* loaded from: classes.dex */
public final class l extends s0 {

    /* renamed from: u, reason: collision with root package name */
    public final A4.d f6982u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC1163b f6983v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC1163b f6984w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC1163b f6985x;

    /* renamed from: y, reason: collision with root package name */
    public final InterfaceC1163b f6986y;

    /* renamed from: z, reason: collision with root package name */
    public final k f6987z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [X4.k] */
    public l(A4.d dVar, W4.i iVar, W4.i iVar2, W4.i iVar3, A1.e eVar) {
        super((ConstraintLayout) dVar.f295e);
        o6.j.e(iVar, "onSortTypeClicked");
        o6.j.e(iVar2, "onSmartChipClicked");
        o6.j.e(iVar3, "onDumbChipClicked");
        o6.j.e(eVar, "onSortOrderClicked");
        this.f6982u = dVar;
        this.f6983v = iVar;
        this.f6984w = iVar2;
        this.f6985x = iVar3;
        this.f6986y = eVar;
        this.f6987z = new m5.f() { // from class: X4.k
            @Override // m5.f
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i4, boolean z8) {
                EnumC0424h enumC0424h;
                if (z8) {
                    InterfaceC1163b interfaceC1163b = l.this.f6983v;
                    if (i4 != R.id.button_most_used) {
                        if (i4 != R.id.button_name) {
                            if (i4 == R.id.button_recent) {
                                enumC0424h = EnumC0424h.f7751e;
                            } else {
                                throw new IllegalArgumentException("Invalid scenario sort button id");
                            }
                        } else {
                            enumC0424h = EnumC0424h.f7750d;
                        }
                    } else {
                        enumC0424h = EnumC0424h.f7752f;
                    }
                    interfaceC1163b.m(enumC0424h);
                }
            }
        };
    }
}
