package O3;

import android.content.ComponentName;
import android.text.Editable;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0 f3944e;

    public /* synthetic */ b0(k0 k0Var, int i4) {
        this.f3943d = i4;
        this.f3944e = k0Var;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f3943d) {
            case 0:
                Editable editable = (Editable) obj;
                o6.j.e(editable, "it");
                this.f3944e.t().h(editable.toString());
                return Z5.y.f7506a;
            default:
                ComponentName componentName = (ComponentName) obj;
                o6.j.e(componentName, "componentName");
                H3.n nVar = this.f3944e.t().f3924b;
                f2.f fVar = (f2.f) nVar.f1950e.a();
                if (fVar != null) {
                    nVar.j(f2.f.i(fVar, null, null, null, 0, null, false, "android.intent.action.MAIN", componentName, 335544320, null, 543));
                }
                return Z5.y.f7506a;
        }
    }
}
