package M1;

import androidx.lifecycle.InterfaceC0499j;
import androidx.lifecycle.b0;
import androidx.lifecycle.f0;
import c3.C0573e;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.game.TutorialGameFragment;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.list.TutorialListFragment;
import com.buzbuz.smartautoclicker.scenarios.list.ScenarioListFragment;
import com.buzbuz.smartautoclicker.settings.SettingsFragment;
import g0.AbstractComponentCallbacksC0755y;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class g extends o6.l implements InterfaceC1162a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0755y f3315g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, Z5.g gVar, int i4) {
        super(0);
        this.f3313e = i4;
        this.f3315g = abstractComponentCallbacksC0755y;
        this.f3314f = gVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object, Z5.g] */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        InterfaceC0499j interfaceC0499j;
        b0 d2;
        InterfaceC0499j interfaceC0499j2;
        b0 d3;
        InterfaceC0499j interfaceC0499j3;
        b0 d9;
        InterfaceC0499j interfaceC0499j4;
        b0 d10;
        InterfaceC0499j interfaceC0499j5;
        b0 d11;
        InterfaceC0499j interfaceC0499j6;
        b0 d12;
        InterfaceC0499j interfaceC0499j7;
        b0 d13;
        InterfaceC0499j interfaceC0499j8;
        b0 d14;
        InterfaceC0499j interfaceC0499j9;
        b0 d15;
        switch (this.f3313e) {
            case 0:
                f0 f0Var = (f0) this.f3314f.getValue();
                if (f0Var instanceof InterfaceC0499j) {
                    interfaceC0499j = (InterfaceC0499j) f0Var;
                } else {
                    interfaceC0499j = null;
                }
                if (interfaceC0499j == null || (d2 = interfaceC0499j.d()) == null) {
                    return ((h) this.f3315g).d();
                }
                return d2;
            case 1:
                f0 f0Var2 = (f0) this.f3314f.getValue();
                if (f0Var2 instanceof InterfaceC0499j) {
                    interfaceC0499j2 = (InterfaceC0499j) f0Var2;
                } else {
                    interfaceC0499j2 = null;
                }
                if (interfaceC0499j2 == null || (d3 = interfaceC0499j2.d()) == null) {
                    return ((TutorialGameFragment) this.f3315g).d();
                }
                return d3;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                f0 f0Var3 = (f0) this.f3314f.getValue();
                if (f0Var3 instanceof InterfaceC0499j) {
                    interfaceC0499j3 = (InterfaceC0499j) f0Var3;
                } else {
                    interfaceC0499j3 = null;
                }
                if (interfaceC0499j3 == null || (d9 = interfaceC0499j3.d()) == null) {
                    return ((TutorialListFragment) this.f3315g).d();
                }
                return d9;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                f0 f0Var4 = (f0) this.f3314f.getValue();
                if (f0Var4 instanceof InterfaceC0499j) {
                    interfaceC0499j4 = (InterfaceC0499j) f0Var4;
                } else {
                    interfaceC0499j4 = null;
                }
                if (interfaceC0499j4 == null || (d10 = interfaceC0499j4.d()) == null) {
                    return ((V4.k) this.f3315g).d();
                }
                return d10;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                f0 f0Var5 = (f0) this.f3314f.getValue();
                if (f0Var5 instanceof InterfaceC0499j) {
                    interfaceC0499j5 = (InterfaceC0499j) f0Var5;
                } else {
                    interfaceC0499j5 = null;
                }
                if (interfaceC0499j5 == null || (d11 = interfaceC0499j5.d()) == null) {
                    return ((ScenarioListFragment) this.f3315g).d();
                }
                return d11;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                f0 f0Var6 = (f0) this.f3314f.getValue();
                if (f0Var6 instanceof InterfaceC0499j) {
                    interfaceC0499j6 = (InterfaceC0499j) f0Var6;
                } else {
                    interfaceC0499j6 = null;
                }
                if (interfaceC0499j6 == null || (d12 = interfaceC0499j6.d()) == null) {
                    return ((Y4.d) this.f3315g).d();
                }
                return d12;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                f0 f0Var7 = (f0) this.f3314f.getValue();
                if (f0Var7 instanceof InterfaceC0499j) {
                    interfaceC0499j7 = (InterfaceC0499j) f0Var7;
                } else {
                    interfaceC0499j7 = null;
                }
                if (interfaceC0499j7 == null || (d13 = interfaceC0499j7.d()) == null) {
                    return ((b5.d) this.f3315g).d();
                }
                return d13;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                f0 f0Var8 = (f0) this.f3314f.getValue();
                if (f0Var8 instanceof InterfaceC0499j) {
                    interfaceC0499j8 = (InterfaceC0499j) f0Var8;
                } else {
                    interfaceC0499j8 = null;
                }
                if (interfaceC0499j8 == null || (d14 = interfaceC0499j8.d()) == null) {
                    return ((C0573e) this.f3315g).d();
                }
                return d14;
            default:
                f0 f0Var9 = (f0) this.f3314f.getValue();
                if (f0Var9 instanceof InterfaceC0499j) {
                    interfaceC0499j9 = (InterfaceC0499j) f0Var9;
                } else {
                    interfaceC0499j9 = null;
                }
                if (interfaceC0499j9 == null || (d15 = interfaceC0499j9.d()) == null) {
                    return ((SettingsFragment) this.f3315g).d();
                }
                return d15;
        }
    }
}
