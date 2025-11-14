package Z3;

import O7.InterfaceC0234g;
import a6.AbstractC0437l;
import android.util.Log;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import d6.InterfaceC0617c;
import java.util.List;
import o6.C1282a;
import o6.InterfaceC1288g;
import q4.X;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f7399e;

    public /* synthetic */ r(D d2, int i4) {
        this.f7398d = i4;
        this.f7399e = d2;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f7398d) {
            case 0:
                return new C1282a(2, this.f7399e, D.class, "onActionEditingStateChanged", "onActionEditingStateChanged(Z)V", 4);
            case 1:
                return new C1282a(2, this.f7399e, D.class, "updateToggleEventName", "updateToggleEventName(Ljava/lang/String;)V", 4);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1282a(2, this.f7399e, D.class, "updateToggleAllField", "updateToggleAllField(Ljava/lang/Integer;)V", 4);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new C1282a(2, this.f7399e, D.class, "updateEventToggleSelector", "updateEventToggleSelector(Lcom/buzbuz/smartautoclicker/feature/smart/config/ui/action/toggleevent/EventToggleSelectorState;)V", 4);
            default:
                return new C1282a(2, this.f7399e, D.class, "updateSaveButton", "updateSaveButton(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f7398d) {
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
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
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
        switch (this.f7398d) {
            case 0:
                return a().hashCode();
            case 1:
                return a().hashCode();
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return a().hashCode();
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        float f8;
        int i4 = this.f7398d;
        int i8 = 0;
        Z5.y yVar = Z5.y.f7506a;
        D d2 = this.f7399e;
        switch (i4) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                d2.getClass();
                if (!booleanValue) {
                    Log.e("ToggleEventDialog", "Closing ToggleEventDialog because there is no action edited");
                    d2.i();
                }
                return yVar;
            case 1:
                String str = (String) obj;
                A4.d dVar = d2.f7324w;
                if (dVar != null) {
                    E2.c.y0((A.i) dVar.f297g, str, 1);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                Integer num = (Integer) obj;
                A4.d dVar2 = d2.f7324w;
                if (dVar2 != null) {
                    A4.c cVar = (A4.c) dVar2.f296f;
                    E2.c.n0((A4.a) cVar.f292f, num);
                    if (num != null) {
                        i8 = num.intValue() + 1;
                    }
                    X.R((A4.c) cVar.f293g, i8);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                C0366a c0366a = (C0366a) obj;
                A4.d dVar3 = d2.f7324w;
                if (dVar3 != null) {
                    A4.a aVar = (A4.a) dVar3.f298h;
                    o6.j.b(aVar);
                    MaterialTextView materialTextView = (MaterialTextView) aVar.f282g;
                    A4.a aVar2 = (A4.a) aVar.f281f;
                    String str2 = c0366a.f7360b;
                    o6.j.e(str2, "titleText");
                    MaterialTextView materialTextView2 = (MaterialTextView) aVar.f283h;
                    o6.j.d(materialTextView2, "title");
                    E2.c.z0(materialTextView2, str2);
                    boolean z8 = c0366a.f7359a;
                    ConstraintLayout constraintLayout = (ConstraintLayout) aVar.f280e;
                    constraintLayout.setEnabled(z8);
                    if (z8) {
                        f8 = 1.0f;
                    } else {
                        f8 = 0.5f;
                    }
                    constraintLayout.setAlpha(f8);
                    Integer num2 = c0366a.f7364f;
                    if (num2 != null) {
                        String string = d2.k().getString(num2.intValue());
                        ((ConstraintLayout) aVar2.f280e).setVisibility(4);
                        o6.j.d(materialTextView, "description");
                        E2.c.z0(materialTextView, string);
                    } else {
                        List X8 = AbstractC0437l.X(String.valueOf(c0366a.f7361c), String.valueOf(c0366a.f7362d), String.valueOf(c0366a.f7363e));
                        ((ConstraintLayout) aVar2.f280e).setVisibility(0);
                        int size = X8.size();
                        if (1 <= size && size < 4) {
                            ((TextView) aVar2.f281f).setText((CharSequence) X8.get(0));
                            ((TextView) aVar2.f282g).setText((CharSequence) X8.get(1));
                            ((TextView) aVar2.f283h).setText((CharSequence) X8.get(2));
                            o6.j.d(materialTextView, "description");
                            E2.c.z0(materialTextView, null);
                        } else {
                            throw new IllegalArgumentException("Container Children should have 1 to 3 entries");
                        }
                    }
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                A4.d dVar4 = d2.f7324w;
                if (dVar4 != null) {
                    X.P((A4.d) dVar4.f299i, booleanValue2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
