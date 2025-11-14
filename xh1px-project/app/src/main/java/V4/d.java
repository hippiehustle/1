package V4;

import O7.InterfaceC0234g;
import Z5.y;
import androidx.appcompat.widget.AppCompatImageView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import d6.InterfaceC0617c;
import kotlin.NoWhenBranchMatchedException;
import o.p1;
import o6.C1282a;
import o6.InterfaceC1288g;
import q4.X;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f6381e;

    public /* synthetic */ d(k kVar, int i4) {
        this.f6380d = i4;
        this.f6381e = kVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f6380d) {
            case 0:
                return new C1282a(2, this.f6381e, k.class, "setInitialScenarioName", "setInitialScenarioName(Ljava/lang/String;)V", 4);
            case 1:
                return new C1282a(2, this.f6381e, k.class, "updateTypeSelection", "updateTypeSelection(Lcom/buzbuz/smartautoclicker/scenarios/creation/ScenarioTypeSelectionState;)V", 4);
            default:
                return new C1282a(2, this.f6381e, k.class, "updateCreationState", "updateCreationState(Lcom/buzbuz/smartautoclicker/scenarios/creation/CreationState;)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f6380d) {
            case 0:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 1:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            default:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f6380d) {
            case 0:
                return a().hashCode();
            case 1:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        boolean z8;
        boolean z9;
        int i4 = this.f6380d;
        int i8 = 0;
        y yVar = y.f7506a;
        k kVar = this.f6381e;
        switch (i4) {
            case 0:
                String str = (String) obj;
                p1 p1Var = kVar.f6400y0;
                if (p1Var != null) {
                    E2.c.y0((A.i) p1Var.f13351g, str, 1);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case 1:
                u uVar = (u) obj;
                p1 p1Var2 = kVar.f6400y0;
                if (p1Var2 != null) {
                    MaterialTextView materialTextView = (MaterialTextView) p1Var2.f13353i;
                    MaterialTextView materialTextView2 = (MaterialTextView) p1Var2.f13352h;
                    R.g gVar = (R.g) p1Var2.j;
                    o6.j.d(gVar, "scenarioTypeDumb");
                    MaterialCardView materialCardView = (MaterialCardView) gVar.f4987e;
                    uVar.getClass();
                    t tVar = uVar.f6425a;
                    t tVar2 = t.f6422d;
                    if (tVar == tVar2) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    materialCardView.setChecked(z8);
                    ((MaterialTextView) gVar.f4989g).setText(R.string.item_title_dumb_scenario);
                    ((AppCompatImageView) gVar.f4988f).setImageResource(R.drawable.ic_dumb);
                    materialCardView.setOnClickListener(new b(kVar, tVar2, 1));
                    R.g gVar2 = (R.g) p1Var2.k;
                    o6.j.d(gVar2, "scenarioTypeSmart");
                    MaterialCardView materialCardView2 = (MaterialCardView) gVar2.f4987e;
                    t tVar3 = t.f6423e;
                    if (tVar == tVar3) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    materialCardView2.setChecked(z9);
                    ((MaterialTextView) gVar2.f4989g).setText(R.string.item_title_smart_scenario);
                    ((AppCompatImageView) gVar2.f4988f).setImageResource(R.drawable.ic_smart);
                    materialCardView2.setOnClickListener(new b(kVar, tVar3, 1));
                    int ordinal = tVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            materialTextView2.setText(R.string.item_desc_smart_scenario);
                            if (!uVar.f6426b) {
                                i8 = 8;
                            }
                            materialTextView.setVisibility(i8);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        materialTextView2.setText(R.string.item_desc_dumb_scenario);
                        materialTextView.setVisibility(8);
                    }
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                a aVar = (a) obj;
                p1 p1Var3 = kVar.f6400y0;
                if (p1Var3 != null) {
                    A4.d dVar = (A4.d) p1Var3.f13350f;
                    int ordinal2 = aVar.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 == 3) {
                                    kVar.S(false, false);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                X.P(dVar, false);
                            }
                        } else {
                            X.P(dVar, true);
                        }
                    } else {
                        X.P(dVar, false);
                    }
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
