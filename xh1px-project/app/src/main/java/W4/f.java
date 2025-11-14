package W4;

import L7.AbstractC0166y;
import O7.i0;
import a6.AbstractC0436k;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.scenarios.list.ScenarioListFragment;
import com.buzbuz.smartautoclicker.settings.SettingsActivity;
import g0.Y;
import java.util.LinkedHashSet;
import o.i1;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements i1, Y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ScenarioListFragment f6593d;

    public /* synthetic */ f(ScenarioListFragment scenarioListFragment) {
        this.f6593d = scenarioListFragment;
    }

    @Override // g0.Y
    public void a(String str, Bundle bundle) {
        x S8 = this.f6593d.S();
        AbstractC0166y.q(U.g(S8), null, null, new q(S8, null), 3);
    }

    @Override // o.i1
    public boolean onMenuItemClick(MenuItem menuItem) {
        Iterable<Z4.k> iterable;
        Z4.a a3;
        o6.j.b(menuItem);
        ScenarioListFragment scenarioListFragment = this.f6593d;
        Z4.r rVar = (Z4.r) scenarioListFragment.S().j.f4088d.f();
        if (rVar != null) {
            switch (menuItem.getItemId()) {
                case R.id.action_cancel /* 2131230775 */:
                    scenarioListFragment.S().e(Z4.q.f7464d);
                    return true;
                case R.id.action_export /* 2131230782 */:
                    Z4.q qVar = rVar.f7468a;
                    Z4.q qVar2 = Z4.q.f7466f;
                    if (qVar == qVar2) {
                        scenarioListFragment.U(false, AbstractC0436k.Q0(((Z4.a) scenarioListFragment.S().f6632i.f()).f7417b), AbstractC0436k.Q0(((Z4.a) scenarioListFragment.S().f6632i.f()).f7416a));
                        return true;
                    }
                    scenarioListFragment.S().e(qVar2);
                    return true;
                case R.id.action_import /* 2131230784 */:
                    scenarioListFragment.U(true, null, null);
                    return true;
                case R.id.action_search /* 2131230792 */:
                    scenarioListFragment.S().e(Z4.q.f7465e);
                    return true;
                case R.id.action_select_all /* 2131230793 */:
                    x S8 = scenarioListFragment.S();
                    i0 i0Var = S8.f6632i;
                    Z4.a aVar = (Z4.a) i0Var.f();
                    Z4.r rVar2 = (Z4.r) S8.j.f4088d.f();
                    if (rVar2 != null) {
                        iterable = rVar2.f7470c;
                    } else {
                        iterable = a6.s.f7766d;
                    }
                    o6.j.e(aVar, "<this>");
                    if (aVar.f7416a.isEmpty() && aVar.f7417b.isEmpty()) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        for (Z4.k kVar : iterable) {
                            if (kVar instanceof Z4.e) {
                                linkedHashSet.add(Long.valueOf(((Z4.e) kVar).f7424b.f13699a.f12187a));
                            } else if (kVar instanceof Z4.g) {
                                linkedHashSet2.add(Long.valueOf(((Z4.g) kVar).f7438b.f12190a.f12187a));
                            }
                        }
                        a3 = Z4.a.a(linkedHashSet, linkedHashSet2);
                    } else {
                        a6.u uVar = a6.u.f7768d;
                        a3 = Z4.a.a(uVar, uVar);
                    }
                    i0Var.h(null, a3);
                    return true;
                case R.id.action_settings /* 2131230794 */:
                    scenarioListFragment.O().startActivity(new Intent(scenarioListFragment.j(), (Class<?>) SettingsActivity.class));
                    return true;
            }
        }
        return false;
    }
}
