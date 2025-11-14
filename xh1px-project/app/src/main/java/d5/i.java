package d5;

import O7.InterfaceC0234g;
import Z5.y;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.buzbuz.smartautoclicker.settings.SettingsFragment;
import com.google.android.material.divider.MaterialDivider;
import d6.InterfaceC0617c;
import o6.C1282a;
import o6.InterfaceC1288g;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SettingsFragment f10418e;

    public /* synthetic */ i(SettingsFragment settingsFragment, int i4) {
        this.f10417d = i4;
        this.f10418e = settingsFragment;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f10417d) {
            case 0:
                return new C1282a(2, this.f10418e, SettingsFragment.class, "updateInputBlockWorkaroundVisibility", "updateInputBlockWorkaroundVisibility(Z)V", 4);
            case 1:
                return new C1282a(2, this.f10418e, SettingsFragment.class, "updateForceEntireScreenVisibility", "updateForceEntireScreenVisibility(Z)V", 4);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1282a(2, this.f10418e, SettingsFragment.class, "updatePrivacySettingsVisibility", "updatePrivacySettingsVisibility(Z)V", 4);
            default:
                return new C1282a(2, this.f10418e, SettingsFragment.class, "updateRemoveAdsVisibility", "updateRemoveAdsVisibility(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f10417d) {
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
        switch (this.f10417d) {
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
        int i4 = this.f10417d;
        y yVar = y.f7506a;
        SettingsFragment settingsFragment = this.f10418e;
        switch (i4) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    H3.b bVar = settingsFragment.f9878i0;
                    if (bVar != null) {
                        ((MaterialDivider) bVar.f1904g).setVisibility(0);
                        H3.b bVar2 = settingsFragment.f9878i0;
                        if (bVar2 != null) {
                            ((ConstraintLayout) ((A4.c) bVar2.k).f291e).setVisibility(0);
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                } else {
                    H3.b bVar3 = settingsFragment.f9878i0;
                    if (bVar3 != null) {
                        ((MaterialDivider) bVar3.f1904g).setVisibility(8);
                        H3.b bVar4 = settingsFragment.f9878i0;
                        if (bVar4 != null) {
                            ((ConstraintLayout) ((A4.c) bVar4.k).f291e).setVisibility(8);
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
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    H3.b bVar5 = settingsFragment.f9878i0;
                    if (bVar5 != null) {
                        ((MaterialDivider) bVar5.f1903f).setVisibility(0);
                        H3.b bVar6 = settingsFragment.f9878i0;
                        if (bVar6 != null) {
                            ((ConstraintLayout) ((A4.c) bVar6.j).f291e).setVisibility(0);
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                } else {
                    H3.b bVar7 = settingsFragment.f9878i0;
                    if (bVar7 != null) {
                        ((MaterialDivider) bVar7.f1903f).setVisibility(8);
                        H3.b bVar8 = settingsFragment.f9878i0;
                        if (bVar8 != null) {
                            ((ConstraintLayout) ((A4.c) bVar8.j).f291e).setVisibility(8);
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
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                if (((Boolean) obj).booleanValue()) {
                    H3.b bVar9 = settingsFragment.f9878i0;
                    if (bVar9 != null) {
                        ((MaterialDivider) bVar9.f1905h).setVisibility(0);
                        H3.b bVar10 = settingsFragment.f9878i0;
                        if (bVar10 != null) {
                            ((ConstraintLayout) ((A4.c) bVar10.f1909n).f291e).setVisibility(0);
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                } else {
                    H3.b bVar11 = settingsFragment.f9878i0;
                    if (bVar11 != null) {
                        ((MaterialDivider) bVar11.f1905h).setVisibility(8);
                        H3.b bVar12 = settingsFragment.f9878i0;
                        if (bVar12 != null) {
                            ((ConstraintLayout) ((A4.c) bVar12.f1909n).f291e).setVisibility(8);
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
            default:
                if (((Boolean) obj).booleanValue()) {
                    H3.b bVar13 = settingsFragment.f9878i0;
                    if (bVar13 != null) {
                        ((MaterialDivider) bVar13.f1906i).setVisibility(0);
                        H3.b bVar14 = settingsFragment.f9878i0;
                        if (bVar14 != null) {
                            ((ConstraintLayout) ((A4.c) bVar14.f1910o).f291e).setVisibility(0);
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                } else {
                    H3.b bVar15 = settingsFragment.f9878i0;
                    if (bVar15 != null) {
                        ((MaterialDivider) bVar15.f1906i).setVisibility(8);
                        H3.b bVar16 = settingsFragment.f9878i0;
                        if (bVar16 != null) {
                            ((ConstraintLayout) ((A4.c) bVar16.f1910o).f291e).setVisibility(8);
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
    }
}
