package R3;

import O7.InterfaceC0234g;
import android.text.InputFilter;
import android.util.Log;
import android.widget.FrameLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import d6.InterfaceC0617c;
import kotlin.NoWhenBranchMatchedException;
import o.p1;
import o6.C1282a;
import o6.InterfaceC1288g;
import q4.X;
import u6.InterfaceC1642c;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f5045e;

    public /* synthetic */ b(n nVar, int i4) {
        this.f5044d = i4;
        this.f5045e = nVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f5044d) {
            case 0:
                return new C1282a(2, this.f5045e, n.class, "onExtraEditingStateChanged", "onExtraEditingStateChanged(Z)V", 4);
            case 1:
                return new C1282a(2, this.f5045e, n.class, "updateExtraKey", "updateExtraKey(Ljava/lang/String;)V", 4);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1282a(2, this.f5045e, n.class, "updateExtraValue", "updateExtraValue(Lcom/buzbuz/smartautoclicker/feature/smart/config/ui/action/intent/extras/ExtraValueInputState;)V", 4);
            default:
                return new C1282a(2, this.f5045e, n.class, "updateSaveButton", "updateSaveButton(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f5044d) {
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
            default:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f5044d) {
            case 0:
                return a().hashCode();
            case 1:
                return a().hashCode();
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        InputFilter[] inputFilterArr;
        int i4 = this.f5044d;
        Z5.y yVar = Z5.y.f7506a;
        n nVar = this.f5045e;
        switch (i4) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                nVar.getClass();
                if (!booleanValue) {
                    Log.e("ExtraConfigDialog", "Closing ExtraConfigDialog because there is no intent extra edited");
                    nVar.i();
                }
                return yVar;
            case 1:
                String str = (String) obj;
                p1 p1Var = nVar.f5072y;
                if (p1Var != null) {
                    E2.c.y0((A.i) p1Var.f13351g, str, 1);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                A a3 = (A) obj;
                p1 p1Var2 = nVar.f5072y;
                if (p1Var2 != null) {
                    ((FrameLayout) p1Var2.k).setVisibility(0);
                    D2.f.K((A4.a) p1Var2.f13353i, a3.a());
                    if (a3 instanceof y) {
                        y yVar2 = (y) a3;
                        p1 p1Var3 = nVar.f5072y;
                        if (p1Var3 != null) {
                            A.i iVar = (A.i) p1Var3.f13352h;
                            ((TextInputLayout) iVar.f88e).setVisibility(8);
                            ((TextInputEditText) iVar.f89f).setTag(null);
                            p1 p1Var4 = nVar.f5072y;
                            if (p1Var4 != null) {
                                A4.a aVar = (A4.a) p1Var4.f13350f;
                                ((FrameLayout) aVar.f280e).setVisibility(0);
                                D2.f.K(aVar, yVar2.f5114b);
                            } else {
                                o6.j.i("viewBinding");
                                throw null;
                            }
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    } else if (a3 instanceof z) {
                        z zVar = (z) a3;
                        p1 p1Var5 = nVar.f5072y;
                        if (p1Var5 != null) {
                            A.i iVar2 = (A.i) p1Var5.f13352h;
                            ((TextInputLayout) iVar2.f88e).setVisibility(0);
                            TextInputEditText textInputEditText = (TextInputEditText) iVar2.f89f;
                            InterfaceC1642c interfaceC1642c = (InterfaceC1642c) textInputEditText.getTag();
                            InterfaceC1642c b4 = o6.v.f13643a.b(zVar.f5119e.getClass());
                            if (!b4.equals(interfaceC1642c)) {
                                textInputEditText.setText(zVar.f5118d);
                                textInputEditText.setInputType(zVar.f5116b);
                                InputFilter inputFilter = zVar.f5117c;
                                if (inputFilter != null) {
                                    inputFilterArr = new InputFilter[]{inputFilter};
                                } else {
                                    inputFilterArr = new InputFilter[0];
                                }
                                textInputEditText.setFilters(inputFilterArr);
                                textInputEditText.setTag(b4);
                            }
                            p1 p1Var6 = nVar.f5072y;
                            if (p1Var6 != null) {
                                ((FrameLayout) ((A4.a) p1Var6.f13350f).f280e).setVisibility(8);
                            } else {
                                o6.j.i("viewBinding");
                                throw null;
                            }
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                p1 p1Var7 = nVar.f5072y;
                if (p1Var7 != null) {
                    X.P((A4.d) p1Var7.j, booleanValue2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
