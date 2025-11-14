package W4;

import O7.InterfaceC0234g;
import Z5.y;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.scenarios.list.ScenarioListFragment;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import d6.InterfaceC0617c;
import g0.T;
import java.util.ArrayList;
import o6.C1282a;
import o6.InterfaceC1288g;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ScenarioListFragment f6598e;

    public /* synthetic */ j(ScenarioListFragment scenarioListFragment, int i4) {
        this.f6597d = i4;
        this.f6598e = scenarioListFragment;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f6597d) {
            case 0:
                return new C1282a(2, this.f6598e, ScenarioListFragment.class, "updateUiState", "updateUiState(Lcom/buzbuz/smartautoclicker/scenarios/list/model/ScenarioListUiState;)V", 4);
            default:
                return new C1282a(2, this.f6598e, ScenarioListFragment.class, "onConditionMigrationRequired", "onConditionMigrationRequired(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f6597d) {
            case 0:
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
        switch (this.f6597d) {
            case 0:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        switch (this.f6597d) {
            case 0:
                Z4.r rVar = (Z4.r) obj;
                if (rVar != null) {
                    ArrayList arrayList = rVar.f7470c;
                    Z4.p pVar = rVar.f7469b;
                    ScenarioListFragment scenarioListFragment = this.f6598e;
                    F3.d dVar = scenarioListFragment.f9866i0;
                    if (dVar != null) {
                        Menu menu = ((MaterialToolbar) dVar.f1328l).getMenu();
                        MenuItem findItem = menu.findItem(R.id.action_select_all);
                        if (findItem != null) {
                            E2.d.c(findItem, pVar.f7459b);
                        }
                        MenuItem findItem2 = menu.findItem(R.id.action_cancel);
                        if (findItem2 != null) {
                            E2.d.c(findItem2, pVar.f7460c);
                        }
                        MenuItem findItem3 = menu.findItem(R.id.action_import);
                        if (findItem3 != null) {
                            E2.d.c(findItem3, pVar.f7461d);
                        }
                        MenuItem findItem4 = menu.findItem(R.id.action_export);
                        if (findItem4 != null) {
                            E2.d.c(findItem4, pVar.f7462e);
                        }
                        MenuItem findItem5 = menu.findItem(R.id.action_search);
                        if (findItem5 != null) {
                            E2.d.c(findItem5, pVar.f7458a);
                            View actionView = findItem5.getActionView();
                            if (actionView != null) {
                                SearchView searchView = (SearchView) actionView;
                                searchView.setIconifiedByDefault(true);
                                searchView.setOnQueryTextListener(new W0.d(29, scenarioListFragment));
                                searchView.addOnAttachStateChangeListener(new L5.l(1, scenarioListFragment));
                            }
                        }
                        MenuItem findItem6 = menu.findItem(R.id.action_settings);
                        if (findItem6 != null) {
                            E2.d.c(findItem6, pVar.f7463f);
                        }
                        F3.d dVar2 = scenarioListFragment.f9866i0;
                        if (dVar2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) dVar2.j;
                            FloatingActionButton floatingActionButton = (FloatingActionButton) dVar2.f1325g;
                            RecyclerView recyclerView = (RecyclerView) dVar2.k;
                            ((CircularProgressIndicator) dVar2.f1323e).setVisibility(8);
                            Z4.q qVar = rVar.f7468a;
                            boolean isEmpty = arrayList.isEmpty();
                            Z4.q qVar2 = Z4.q.f7464d;
                            int i4 = 0;
                            if (isEmpty && qVar == qVar2) {
                                recyclerView.setVisibility(8);
                                floatingActionButton.setVisibility(8);
                                constraintLayout.setVisibility(0);
                            } else {
                                recyclerView.setVisibility(0);
                                if (qVar != qVar2) {
                                    i4 = 8;
                                }
                                floatingActionButton.setVisibility(i4);
                                constraintLayout.setVisibility(8);
                            }
                            X4.g gVar = scenarioListFragment.j0;
                            if (gVar != null) {
                                gVar.h(arrayList);
                            } else {
                                o6.j.i("scenariosAdapter");
                                throw null;
                            }
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                }
                return y.f7506a;
            default:
                if (((Boolean) obj).booleanValue()) {
                    ScenarioListFragment scenarioListFragment2 = this.f6598e;
                    if (scenarioListFragment2.M().p().E("ConditionsMigrationDialog") == null) {
                        T p8 = scenarioListFragment2.M().p();
                        o6.j.d(p8, "getSupportFragmentManager(...)");
                        p8.b0(":ConditionsMigrationDialog:state", scenarioListFragment2, new f(scenarioListFragment2));
                        new b5.d().V(p8, "ConditionsMigrationDialog");
                    }
                }
                return y.f7506a;
        }
    }
}
