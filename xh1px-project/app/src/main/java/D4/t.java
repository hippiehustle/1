package D4;

import O3.C0219q;
import O3.C0224w;
import O7.InterfaceC0234g;
import Z3.C0372g;
import a6.AbstractC0436k;
import android.view.View;
import android.widget.TextView;
import c4.C0580g;
import com.buzbuz.smartautoclicker.feature.qstile.ui.QSTileService;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.overlay.TutorialFullscreenView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textview.MaterialTextView;
import d4.C0595a;
import d6.InterfaceC0617c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import k3.C0958e;
import kotlin.NoWhenBranchMatchedException;
import o.p1;
import o6.C1282a;
import o6.InterfaceC1288g;
import q4.X;
import r3.C1450n;
import r4.C1466f;
import v4.C1674i;
import x3.C1784a;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f989e;

    public /* synthetic */ t(int i4, Object obj) {
        this.f988d = i4;
        this.f989e = obj;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f988d) {
            case 0:
                return new C1282a(2, (A) this.f989e, A.class, "updateDetectionResults", "updateDetectionResults(Lcom/buzbuz/smartautoclicker/feature/smart/debugging/ui/overlay/ImageEventResultsDisplay;)V", 4);
            case 1:
                return new C1282a(2, (H) this.f989e, H.class, "updateDetectionResults", "updateDetectionResults(Lcom/buzbuz/smartautoclicker/feature/smart/debugging/ui/overlay/ImageConditionResultsDisplay;)V", 4);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1282a(2, (TextView) this.f989e, TextView.class, "setText", "setText(Ljava/lang/CharSequence;)V", 4);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new C1282a(2, (E4.g) this.f989e, E4.g.class, "updateReport", "updateReport(Ljava/util/List;)V", 4);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return new C1282a(2, (M1.h) this.f989e, M1.h.class, "updateDialogUiState", "updateDialogUiState(Lcom/buzbuz/smartautoclicker/core/common/permissions/ui/PermissionDialogUiState;)V", 4);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return new C1282a(2, (N3.d) this.f989e, N3.d.class, "updateActionList", "updateActionList(Ljava/util/List;)V", 4);
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C1282a(2, (C0219q) this.f989e, C0219q.class, "updateSendingType", "updateSendingType(Lcom/buzbuz/smartautoclicker/core/ui/bindings/dropdown/DropdownItem;)V", 4);
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C1282a(2, (C0224w) this.f989e, C0224w.class, "submitList", "submitList(Ljava/util/List;)V", 4);
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return new C1282a(2, (P3.e) this.f989e, P3.e.class, "updateActivityList", "updateActivityList(Ljava/util/List;)V", 4);
            case 9:
                return new C1282a(2, (Q3.f) this.f989e, Q3.f.class, "updateActivityList", "updateActivityList(Ljava/util/List;)V", 4);
            case 10:
                return new C1282a(2, (R4.d) this.f989e, R4.d.class, "submitList", "submitList(Ljava/util/List;)V", 4);
            case 11:
                return new C1282a(2, (S3.a) this.f989e, S3.a.class, "submitList", "submitList(Ljava/util/List;)V", 4);
            case 12:
                return new C1282a(2, (S4.h) this.f989e, S4.h.class, "updateUiState", "updateUiState(Lcom/buzbuz/smartautoclicker/feature/tutorial/ui/overlay/UiTutorialOverlayState;)V", 4);
            case 13:
                return new C1282a(2, (C0372g) this.f989e, C0372g.class, "updateToggleList", "updateToggleList(Ljava/util/List;)V", 4);
            case 14:
                return new C1282a(2, (b5.d) this.f989e, b5.d.class, "updateUiState", "updateUiState(Lcom/buzbuz/smartautoclicker/scenarios/migration/ConditionsMigrationUiState;)V", 4);
            case 15:
                return new C1282a(2, (C0580g) this.f989e, C0580g.class, "updateCounterNames", "updateCounterNames(Ljava/util/Set;)V", 4);
            case 16:
                return new C1282a(2, (C0595a) this.f989e, C0595a.class, "submitList", "submitList(Ljava/util/List;)V", 4);
            case 17:
                return new C1282a(2, (j4.f) this.f989e, j4.f.class, "updateConditionList", "updateConditionList(Ljava/util/List;)V", 4);
            case 18:
                return new C1282a(2, (C0958e) this.f989e, C0958e.class, "updateActionList", "updateActionList(Ljava/util/List;)V", 4);
            case 19:
                return new C1282a(2, (C1450n) this.f989e, C1450n.class, "updateFieldRandomization", "updateFieldRandomization(Z)V", 4);
            case 20:
                return new C1282a(2, (C1466f) this.f989e, C1466f.class, "updateEventList", "updateEventList(Ljava/util/List;)V", 4);
            case 21:
                return new C1282a(2, (C1674i) this.f989e, C1674i.class, "updateDebugReportAvailability", "updateDebugReportAvailability(Z)V", 4);
            default:
                return new C1282a(2, (QSTileService) this.f989e, QSTileService.class, "updateTile", "updateTile(Lcom/buzbuz/smartautoclicker/feature/qstile/domain/QSTileDisplayInfo;)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f988d) {
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
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 9:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 10:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 11:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 12:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 13:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 14:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 15:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 16:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 17:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 18:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 19:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 20:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 21:
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
        switch (this.f988d) {
            case 0:
                return a().hashCode();
            case 1:
                return a().hashCode();
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return a().hashCode();
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return a().hashCode();
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return a().hashCode();
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return a().hashCode();
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return a().hashCode();
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return a().hashCode();
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return a().hashCode();
            case 9:
                return a().hashCode();
            case 10:
                return a().hashCode();
            case 11:
                return a().hashCode();
            case 12:
                return a().hashCode();
            case 13:
                return a().hashCode();
            case 14:
                return a().hashCode();
            case 15:
                return a().hashCode();
            case 16:
                return a().hashCode();
            case 17:
                return a().hashCode();
            case 18:
                return a().hashCode();
            case 19:
                return a().hashCode();
            case 20:
                return a().hashCode();
            case 21:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        C0029e c0029e;
        List<C0030f> list;
        C0029e c0029e2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i4 = this.f988d;
        List<C0030f> list2 = a6.s.f7766d;
        String str = null;
        Z5.y yVar = Z5.y.f7506a;
        Object obj2 = this.f989e;
        switch (i4) {
            case 0:
                C0032h c0032h = (C0032h) obj;
                A a3 = (A) obj2;
                View view = a3.f1161F;
                if (view instanceof C0029e) {
                    c0029e = (C0029e) view;
                } else {
                    c0029e = null;
                }
                if (c0029e != null) {
                    if (c0032h != null && (list = c0032h.f960b) != null) {
                        list2 = list;
                    }
                    c0029e.setResults(list2);
                }
                A.i iVar = a3.f898L;
                if (iVar != null) {
                    TextView textView = (TextView) iVar.f89f;
                    if (c0032h != null) {
                        str = c0032h.f959a;
                    }
                    textView.setText(str);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case 1:
                C0031g c0031g = (C0031g) obj;
                H h8 = (H) obj2;
                View view2 = h8.f1161F;
                if (view2 instanceof C0029e) {
                    c0029e2 = (C0029e) view2;
                } else {
                    c0029e2 = null;
                }
                if (c0029e2 != null) {
                    if (c0031g != null) {
                        list2 = E2.d.y(c0031g.f958b);
                    }
                    c0029e2.setResults(list2);
                }
                A4.c cVar = h8.f914M;
                if (cVar != null) {
                    TextView textView2 = (TextView) cVar.f292f;
                    if (c0031g != null) {
                        str = c0031g.f957a;
                    }
                    textView2.setText(str);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                ((TextView) obj2).setText((CharSequence) obj);
                return yVar;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                List list3 = (List) obj;
                E4.g gVar = (E4.g) obj2;
                p1 p1Var = gVar.f1216v;
                if (p1Var != null) {
                    E2.c.G0(p1Var, list3);
                    C0224w c0224w = gVar.f1217w;
                    if (c0224w != null) {
                        c0224w.h(list3);
                        return yVar;
                    }
                    o6.j.i("reportAdapter");
                    throw null;
                }
                o6.j.i("listBinding");
                throw null;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                M1.j jVar = (M1.j) obj;
                M1.h hVar = (M1.h) obj2;
                if (jVar != null) {
                    A4.c cVar2 = hVar.f3322y0;
                    if (cVar2 != null) {
                        ((MaterialTextView) cVar2.f293g).setText(jVar.f3324b);
                        ((MaterialTextView) cVar2.f292f).setText(jVar.f3325c);
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                }
                return yVar;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                List list4 = (List) obj;
                N3.d dVar = (N3.d) obj2;
                p1 p1Var2 = dVar.J().f1331f;
                o6.j.d(p1Var2, "layoutLoadableList");
                E2.c.G0(p1Var2, list4);
                R4.d dVar2 = dVar.f3745x;
                if (dVar2 != null) {
                    if (list4 == null) {
                        arrayList = new ArrayList();
                    } else {
                        arrayList = new ArrayList(list4);
                    }
                    dVar2.h(arrayList);
                    return yVar;
                }
                o6.j.i("actionCopyAdapter");
                throw null;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                D2.d dVar3 = (D2.d) obj;
                C0219q c0219q = (C0219q) obj2;
                F3.a aVar = c0219q.f3990m;
                if (aVar != null) {
                    D2.f.K((A4.a) aVar.j, dVar3);
                    if (dVar3.equals(c0219q.t().f3934n)) {
                        F3.a aVar2 = c0219q.f3990m;
                        if (aVar2 != null) {
                            E2.d.H((A4.a) aVar2.f1307h, true);
                            F3.a aVar3 = c0219q.f3990m;
                            if (aVar3 != null) {
                                E2.d.H((A4.a) aVar3.f1306g, true);
                            } else {
                                o6.j.i("viewBinding");
                                throw null;
                            }
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    } else if (dVar3.equals(c0219q.t().f3935o)) {
                        F3.a aVar4 = c0219q.f3990m;
                        if (aVar4 != null) {
                            E2.d.H((A4.a) aVar4.f1307h, false);
                            F3.a aVar5 = c0219q.f3990m;
                            if (aVar5 != null) {
                                E2.d.H((A4.a) aVar5.f1306g, false);
                            } else {
                                o6.j.i("viewBinding");
                                throw null;
                            }
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    }
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                ((C0224w) obj2).h((List) obj);
                return yVar;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                List list5 = (List) obj;
                P3.e eVar = (P3.e) obj2;
                A4.c cVar3 = eVar.f4507w;
                if (cVar3 != null) {
                    p1 p1Var3 = (p1) cVar3.f292f;
                    o6.j.d(p1Var3, "layoutLoadableList");
                    E2.c.G0(p1Var3, list5);
                    R4.d dVar4 = eVar.f4508x;
                    if (dVar4 != null) {
                        dVar4.h(list5);
                        return yVar;
                    }
                    o6.j.i("activitiesAdapter");
                    throw null;
                }
                o6.j.i("viewBinding");
                throw null;
            case 9:
                List list6 = (List) obj;
                Q3.f fVar = (Q3.f) obj2;
                A4.c cVar4 = fVar.f4850w;
                if (cVar4 != null) {
                    p1 p1Var4 = (p1) cVar4.f292f;
                    o6.j.d(p1Var4, "layoutLoadableList");
                    E2.c.G0(p1Var4, list6);
                    R4.d dVar5 = fVar.f4851x;
                    if (dVar5 != null) {
                        dVar5.h(list6);
                        return yVar;
                    }
                    o6.j.i("activitiesAdapter");
                    throw null;
                }
                o6.j.i("viewBinding");
                throw null;
            case 10:
                ((R4.d) obj2).h((List) obj);
                return yVar;
            case 11:
                ((S3.a) obj2).h((List) obj);
                return yVar;
            case 12:
                S4.m mVar = (S4.m) obj;
                S4.h hVar2 = (S4.h) obj2;
                hVar2.getClass();
                if (mVar != null) {
                    E2.d dVar6 = mVar.f5396c;
                    if (o6.j.a(dVar6, S4.b.f5364e)) {
                        A4.d dVar7 = hVar2.f5380u;
                        if (dVar7 != null) {
                            ((MaterialButton) dVar7.f296f).setVisibility(0);
                            ((TutorialFullscreenView) dVar7.f299i).setExpectedViewPosition(null);
                            hVar2.D(mVar);
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    } else if (dVar6 instanceof S4.a) {
                        o6.j.c(dVar6, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.tutorial.ui.overlay.TutorialExitButton.MonitoredView");
                        S4.a aVar6 = (S4.a) dVar6;
                        A4.d dVar8 = hVar2.f5380u;
                        if (dVar8 != null) {
                            ((MaterialButton) dVar8.f296f).setVisibility(8);
                            ((TutorialFullscreenView) dVar8.f299i).setExpectedViewPosition(aVar6.f5363f);
                            hVar2.D(mVar);
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    } else {
                        A4.d dVar9 = hVar2.f5380u;
                        if (dVar9 != null) {
                            ((MaterialButton) dVar9.f296f).setVisibility(8);
                            ((TutorialFullscreenView) dVar9.f299i).setExpectedViewPosition(null);
                            hVar2.D(mVar);
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    }
                }
                return yVar;
            case 13:
                List list7 = (List) obj;
                C0372g c0372g = (C0372g) obj2;
                F3.e eVar2 = c0372g.f7377w;
                if (eVar2 != null) {
                    p1 p1Var5 = eVar2.f1331f;
                    o6.j.d(p1Var5, "layoutLoadableList");
                    E2.c.G0(p1Var5, list7);
                    R4.d dVar10 = c0372g.f7378x;
                    if (dVar10 != null) {
                        dVar10.h(list7);
                        return yVar;
                    }
                    o6.j.i("eventToggleAdapter");
                    throw null;
                }
                o6.j.i("viewBinding");
                throw null;
            case 14:
                b5.f fVar2 = (b5.f) obj;
                b5.d dVar11 = (b5.d) obj2;
                R.g gVar2 = dVar11.f9192y0;
                if (gVar2 != null) {
                    ((MaterialTextView) gVar2.f4989g).setText(fVar2.f9194b);
                    R.g gVar3 = dVar11.f9192y0;
                    if (gVar3 != null) {
                        A4.c cVar5 = (A4.c) gVar3.f4988f;
                        MaterialButton materialButton = (MaterialButton) cVar5.f292f;
                        E2.b bVar = fVar2.f9195c;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) cVar5.f293g;
                        if (bVar instanceof B2.d) {
                            materialButton.setAlpha(0.5f);
                            materialButton.setText(((B2.d) bVar).f448d);
                            C5.b bVar2 = circularProgressIndicator.f653l;
                            int i8 = circularProgressIndicator.f650g;
                            if (i8 > 0) {
                                circularProgressIndicator.removeCallbacks(bVar2);
                                circularProgressIndicator.postDelayed(bVar2, i8);
                            } else {
                                bVar2.run();
                            }
                        } else if (bVar instanceof B2.c) {
                            materialButton.setText(((B2.c) bVar).f447d);
                            circularProgressIndicator.setVisibility(8);
                            if (((B2.c) bVar) instanceof B2.c) {
                                materialButton.setAlpha(1.0f);
                                materialButton.setEnabled(true);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        materialButton.setOnClickListener(new B2.b(0, new A1.n(fVar2, 14, dVar11)));
                        return yVar;
                    }
                    o6.j.i("viewBinding");
                    throw null;
                }
                o6.j.i("viewBinding");
                throw null;
            case 15:
                Set set = (Set) obj;
                C0580g c0580g = (C0580g) obj2;
                A4.c cVar6 = c0580g.f9662w;
                if (cVar6 != null) {
                    p1 p1Var6 = (p1) cVar6.f292f;
                    o6.j.d(p1Var6, "layoutLoadableList");
                    E2.c.G0(p1Var6, set);
                    R4.d dVar12 = c0580g.f9663x;
                    if (dVar12 != null) {
                        dVar12.h(AbstractC0436k.Q0(set));
                        return yVar;
                    }
                    o6.j.i("counterNameAdapter");
                    throw null;
                }
                o6.j.i("viewBinding");
                throw null;
            case 16:
                ((C0595a) obj2).h((List) obj);
                return yVar;
            case 17:
                List list8 = (List) obj;
                j4.f fVar3 = (j4.f) obj2;
                p1 p1Var7 = fVar3.J().f1331f;
                o6.j.d(p1Var7, "layoutLoadableList");
                E2.c.G0(p1Var7, list8);
                j4.b bVar3 = fVar3.f11926x;
                if (bVar3 != null) {
                    if (list8 == null) {
                        arrayList2 = new ArrayList();
                    } else {
                        arrayList2 = new ArrayList(list8);
                    }
                    bVar3.h(arrayList2);
                    return yVar;
                }
                o6.j.i("conditionAdapter");
                throw null;
            case 18:
                List list9 = (List) obj;
                C0958e c0958e = (C0958e) obj2;
                p1 p1Var8 = c0958e.J().f1331f;
                o6.j.d(p1Var8, "layoutLoadableList");
                E2.c.G0(p1Var8, list9);
                R4.d dVar13 = c0958e.f11985x;
                if (dVar13 != null) {
                    dVar13.h(new ArrayList(list9));
                    return yVar;
                }
                o6.j.i("actionCopyAdapter");
                throw null;
            case 19:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                A4.d dVar14 = ((C1450n) obj2).f14341m;
                if (dVar14 != null) {
                    A4.c cVar7 = (A4.c) dVar14.f296f;
                    o6.j.b(cVar7);
                    E2.b.H(cVar7, booleanValue);
                    E2.b.I(cVar7, booleanValue ? 1 : 0);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case 20:
                List list10 = (List) obj;
                C1466f c1466f = (C1466f) obj2;
                p1 p1Var9 = c1466f.J().f1331f;
                o6.j.d(p1Var9, "layoutLoadableList");
                E2.c.G0(p1Var9, list10);
                R4.d dVar15 = c1466f.f14393y;
                if (dVar15 != null) {
                    dVar15.h(list10);
                    return yVar;
                }
                o6.j.i("eventCopyAdapter");
                throw null;
            case 21:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                A4.a aVar7 = ((C1674i) obj2).f15533m;
                if (aVar7 != null) {
                    A4.c cVar8 = (A4.c) aVar7.f283h;
                    o6.j.b(cVar8);
                    E2.c.q0(cVar8, booleanValue2);
                    A4.c cVar9 = (A4.c) cVar8.f293g;
                    o6.j.d(cVar9, "titleAndDescription");
                    X.R(cVar9, booleanValue2 ? 1 : 0);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                int i9 = QSTileService.f9803l;
                ((QSTileService) obj2).d((C1784a) obj);
                return yVar;
        }
    }
}
