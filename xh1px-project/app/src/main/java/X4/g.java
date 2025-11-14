package X4;

import A1.o;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import t0.L;
import t0.s0;

/* loaded from: classes.dex */
public final class g extends L {

    /* renamed from: e, reason: collision with root package name */
    public final o f6960e;

    /* renamed from: f, reason: collision with root package name */
    public final A1.e f6961f;

    /* renamed from: g, reason: collision with root package name */
    public final W4.i f6962g;

    /* renamed from: h, reason: collision with root package name */
    public final W4.i f6963h;

    /* renamed from: i, reason: collision with root package name */
    public final W4.i f6964i;
    public final A1.e j;
    public final W4.i k;

    /* renamed from: l, reason: collision with root package name */
    public final W4.i f6965l;

    /* renamed from: m, reason: collision with root package name */
    public final W4.i f6966m;

    /* renamed from: n, reason: collision with root package name */
    public final A1.e f6967n;

    public g(o oVar, A1.e eVar, W4.i iVar, W4.i iVar2, W4.i iVar3, A1.e eVar2, W4.i iVar4, W4.i iVar5, W4.i iVar6, A1.e eVar3) {
        super(f.f6958f);
        this.f6960e = oVar;
        this.f6961f = eVar;
        this.f6962g = iVar;
        this.f6963h = iVar2;
        this.f6964i = iVar3;
        this.j = eVar2;
        this.k = iVar4;
        this.f6965l = iVar5;
        this.f6966m = iVar6;
        this.f6967n = eVar3;
    }

    @Override // t0.U
    public final int c(int i4) {
        Z4.k kVar = (Z4.k) g(i4);
        if (kVar instanceof Z4.d) {
            return R.layout.item_empty_scenario;
        }
        if (kVar instanceof Z4.e) {
            return R.layout.item_dumb_scenario;
        }
        if (kVar instanceof Z4.g) {
            return R.layout.item_smart_scenario;
        }
        if (kVar instanceof Z4.j) {
            return R.layout.item_ordering_and_filtering;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // t0.U
    public final void d(s0 s0Var, int i4) {
        int i8;
        int i9;
        if (s0Var instanceof d) {
            final d dVar = (d) s0Var;
            Object g8 = g(i4);
            o6.j.c(g8, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.scenarios.list.model.ScenarioListUiState.Item.ScenarioItem.Empty");
            final Z4.d dVar2 = (Z4.d) g8;
            A4.a aVar = dVar.f6951u;
            ((MaterialTextView) aVar.f283h).setText(dVar2.f7446a);
            MaterialTextView materialTextView = (MaterialTextView) aVar.f283h;
            if (dVar2.b() instanceof p2.e) {
                i9 = R.drawable.ic_dumb;
            } else {
                i9 = R.drawable.ic_smart;
            }
            materialTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(materialTextView.getContext().getDrawable(i9), (Drawable) null, (Drawable) null, (Drawable) null);
            final int i10 = 0;
            ((MaterialButton) aVar.f282g).setOnClickListener(new View.OnClickListener() { // from class: X4.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            dVar.f6952v.m(dVar2);
                            return;
                        default:
                            dVar.f6953w.m(dVar2);
                            return;
                    }
                }
            });
            final int i11 = 1;
            ((MaterialButton) aVar.f281f).setOnClickListener(new View.OnClickListener() { // from class: X4.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            dVar.f6952v.m(dVar2);
                            return;
                        default:
                            dVar.f6953w.m(dVar2);
                            return;
                    }
                }
            });
            return;
        }
        if (s0Var instanceof b) {
            final b bVar = (b) s0Var;
            Object g9 = g(i4);
            o6.j.c(g9, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.scenarios.list.model.ScenarioListUiState.Item.ScenarioItem.Valid.Dumb");
            final Z4.e eVar = (Z4.e) g9;
            H3.b bVar2 = bVar.f6942u;
            MaterialTextView materialTextView2 = (MaterialTextView) bVar2.f1910o;
            ConstraintLayout constraintLayout = (ConstraintLayout) bVar2.f1909n;
            MaterialCardView materialCardView = (MaterialCardView) bVar2.f1902e;
            MaterialDivider materialDivider = (MaterialDivider) bVar2.f1912q;
            MaterialRadioButton materialRadioButton = (MaterialRadioButton) bVar2.f1906i;
            MaterialButton materialButton = (MaterialButton) bVar2.f1905h;
            materialTextView2.setText(eVar.f7446a);
            boolean z8 = eVar.f7425c;
            if (z8) {
                materialButton.setVisibility(4);
                materialButton.setEnabled(false);
                materialRadioButton.setVisibility(0);
                materialRadioButton.setChecked(eVar.f7426d);
                materialDivider.setVisibility(8);
                final int i12 = 0;
                materialCardView.setOnClickListener(new View.OnClickListener() { // from class: X4.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                bVar.f6945x.m(eVar);
                                return;
                            case 1:
                                bVar.f6943v.m(eVar);
                                return;
                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                bVar.f6946y.m(eVar);
                                return;
                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                bVar.f6944w.m(eVar);
                                return;
                            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                bVar.f6947z.m(eVar);
                                return;
                            default:
                                bVar.f6945x.m(eVar);
                                return;
                        }
                    }
                });
            } else {
                materialButton.setVisibility(0);
                materialButton.setEnabled(true);
                materialRadioButton.setVisibility(8);
                materialDivider.setVisibility(0);
                final int i13 = 1;
                materialCardView.setOnClickListener(new View.OnClickListener() { // from class: X4.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                bVar.f6945x.m(eVar);
                                return;
                            case 1:
                                bVar.f6943v.m(eVar);
                                return;
                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                bVar.f6946y.m(eVar);
                                return;
                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                bVar.f6944w.m(eVar);
                                return;
                            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                bVar.f6947z.m(eVar);
                                return;
                            default:
                                bVar.f6945x.m(eVar);
                                return;
                        }
                    }
                });
            }
            if (!z8 && eVar.f7427e) {
                constraintLayout.setVisibility(0);
                materialButton.setIconResource(R.drawable.ic_chevron_up);
                ((MaterialTextView) bVar2.j).setText(String.valueOf(eVar.f7430h));
                ((MaterialTextView) bVar2.f1911p).setText(String.valueOf(eVar.f7431i));
                ((MaterialTextView) bVar2.f1907l).setText(String.valueOf(eVar.j));
                ((MaterialTextView) bVar2.f1908m).setText(eVar.k);
                ((MaterialTextView) bVar2.k).setText(eVar.f7432l);
            } else {
                materialButton.setIconResource(R.drawable.ic_chevron_down);
                constraintLayout.setVisibility(8);
            }
            final int i14 = 2;
            ((MaterialButton) bVar2.f1903f).setOnClickListener(new View.OnClickListener() { // from class: X4.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            bVar.f6945x.m(eVar);
                            return;
                        case 1:
                            bVar.f6943v.m(eVar);
                            return;
                        case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                            bVar.f6946y.m(eVar);
                            return;
                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                            bVar.f6944w.m(eVar);
                            return;
                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                            bVar.f6947z.m(eVar);
                            return;
                        default:
                            bVar.f6945x.m(eVar);
                            return;
                    }
                }
            });
            final int i15 = 3;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: X4.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            bVar.f6945x.m(eVar);
                            return;
                        case 1:
                            bVar.f6943v.m(eVar);
                            return;
                        case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                            bVar.f6946y.m(eVar);
                            return;
                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                            bVar.f6944w.m(eVar);
                            return;
                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                            bVar.f6947z.m(eVar);
                            return;
                        default:
                            bVar.f6945x.m(eVar);
                            return;
                    }
                }
            });
            final int i16 = 4;
            ((MaterialButton) bVar2.f1904g).setOnClickListener(new View.OnClickListener() { // from class: X4.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            bVar.f6945x.m(eVar);
                            return;
                        case 1:
                            bVar.f6943v.m(eVar);
                            return;
                        case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                            bVar.f6946y.m(eVar);
                            return;
                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                            bVar.f6944w.m(eVar);
                            return;
                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                            bVar.f6947z.m(eVar);
                            return;
                        default:
                            bVar.f6945x.m(eVar);
                            return;
                    }
                }
            });
            final int i17 = 5;
            materialRadioButton.setOnClickListener(new View.OnClickListener() { // from class: X4.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            bVar.f6945x.m(eVar);
                            return;
                        case 1:
                            bVar.f6943v.m(eVar);
                            return;
                        case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                            bVar.f6946y.m(eVar);
                            return;
                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                            bVar.f6944w.m(eVar);
                            return;
                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                            bVar.f6947z.m(eVar);
                            return;
                        default:
                            bVar.f6945x.m(eVar);
                            return;
                    }
                }
            });
            return;
        }
        if (s0Var instanceof i) {
            final i iVar = (i) s0Var;
            Object g10 = g(i4);
            o6.j.c(g10, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.scenarios.list.model.ScenarioListUiState.Item.ScenarioItem.Valid.Smart");
            final Z4.g gVar = (Z4.g) g10;
            List list = gVar.f7444h;
            F3.f fVar = iVar.f6972u;
            MaterialTextView materialTextView3 = (MaterialTextView) fVar.f1341o;
            MaterialTextView materialTextView4 = (MaterialTextView) fVar.f1339m;
            RecyclerView recyclerView = (RecyclerView) fVar.f1338l;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) fVar.f1340n;
            MaterialCardView materialCardView2 = (MaterialCardView) fVar.f1333e;
            MaterialDivider materialDivider2 = (MaterialDivider) fVar.f1334f;
            MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) fVar.j;
            MaterialButton materialButton2 = (MaterialButton) fVar.f1337i;
            materialTextView3.setText(gVar.f7446a);
            boolean z9 = gVar.f7439c;
            if (z9) {
                materialButton2.setVisibility(4);
                materialButton2.setEnabled(false);
                materialRadioButton2.setVisibility(0);
                materialRadioButton2.setChecked(gVar.f7440d);
                materialDivider2.setVisibility(8);
                final int i18 = 0;
                materialCardView2.setOnClickListener(new View.OnClickListener() { // from class: X4.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i18) {
                            case 0:
                                iVar.f6975x.m(gVar);
                                return;
                            case 1:
                                iVar.f6973v.m(gVar);
                                return;
                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                iVar.f6976y.m(gVar);
                                return;
                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                iVar.f6974w.m(gVar);
                                return;
                            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                iVar.f6977z.m(gVar);
                                return;
                            default:
                                iVar.f6975x.m(gVar);
                                return;
                        }
                    }
                });
            } else {
                materialButton2.setVisibility(0);
                materialButton2.setEnabled(true);
                materialRadioButton2.setVisibility(8);
                materialDivider2.setVisibility(0);
                final int i19 = 1;
                materialCardView2.setOnClickListener(new View.OnClickListener() { // from class: X4.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i19) {
                            case 0:
                                iVar.f6975x.m(gVar);
                                return;
                            case 1:
                                iVar.f6973v.m(gVar);
                                return;
                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                iVar.f6976y.m(gVar);
                                return;
                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                iVar.f6974w.m(gVar);
                                return;
                            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                iVar.f6977z.m(gVar);
                                return;
                            default:
                                iVar.f6975x.m(gVar);
                                return;
                        }
                    }
                });
            }
            if (!z9 && gVar.f7441e) {
                constraintLayout2.setVisibility(0);
                materialButton2.setIconResource(R.drawable.ic_chevron_up);
                ((MaterialTextView) fVar.k).setText(String.valueOf(gVar.j));
                ((MaterialTextView) fVar.f1342p).setText(String.valueOf(gVar.f7445i));
                iVar.f6971A.h(list);
                if (list.isEmpty()) {
                    recyclerView.setVisibility(8);
                    materialTextView4.setVisibility(0);
                } else {
                    recyclerView.setVisibility(0);
                    materialTextView4.setVisibility(8);
                }
            } else {
                materialButton2.setIconResource(R.drawable.ic_chevron_down);
                constraintLayout2.setVisibility(8);
            }
            final int i20 = 2;
            ((MaterialButton) fVar.f1335g).setOnClickListener(new View.OnClickListener() { // from class: X4.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i20) {
                        case 0:
                            iVar.f6975x.m(gVar);
                            return;
                        case 1:
                            iVar.f6973v.m(gVar);
                            return;
                        case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                            iVar.f6976y.m(gVar);
                            return;
                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                            iVar.f6974w.m(gVar);
                            return;
                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                            iVar.f6977z.m(gVar);
                            return;
                        default:
                            iVar.f6975x.m(gVar);
                            return;
                    }
                }
            });
            final int i21 = 3;
            materialButton2.setOnClickListener(new View.OnClickListener() { // from class: X4.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i21) {
                        case 0:
                            iVar.f6975x.m(gVar);
                            return;
                        case 1:
                            iVar.f6973v.m(gVar);
                            return;
                        case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                            iVar.f6976y.m(gVar);
                            return;
                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                            iVar.f6974w.m(gVar);
                            return;
                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                            iVar.f6977z.m(gVar);
                            return;
                        default:
                            iVar.f6975x.m(gVar);
                            return;
                    }
                }
            });
            final int i22 = 4;
            ((MaterialButton) fVar.f1336h).setOnClickListener(new View.OnClickListener() { // from class: X4.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i22) {
                        case 0:
                            iVar.f6975x.m(gVar);
                            return;
                        case 1:
                            iVar.f6973v.m(gVar);
                            return;
                        case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                            iVar.f6976y.m(gVar);
                            return;
                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                            iVar.f6974w.m(gVar);
                            return;
                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                            iVar.f6977z.m(gVar);
                            return;
                        default:
                            iVar.f6975x.m(gVar);
                            return;
                    }
                }
            });
            final int i23 = 5;
            materialRadioButton2.setOnClickListener(new View.OnClickListener() { // from class: X4.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i23) {
                        case 0:
                            iVar.f6975x.m(gVar);
                            return;
                        case 1:
                            iVar.f6973v.m(gVar);
                            return;
                        case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                            iVar.f6976y.m(gVar);
                            return;
                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                            iVar.f6974w.m(gVar);
                            return;
                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                            iVar.f6977z.m(gVar);
                            return;
                        default:
                            iVar.f6975x.m(gVar);
                            return;
                    }
                }
            });
            return;
        }
        if (s0Var instanceof l) {
            final l lVar = (l) s0Var;
            Object g11 = g(i4);
            o6.j.c(g11, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.scenarios.list.model.ScenarioListUiState.Item.SortItem");
            Z4.j jVar = (Z4.j) g11;
            final A4.d dVar3 = lVar.f6982u;
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) dVar3.f296f;
            int ordinal = jVar.f7447a.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        i8 = R.id.button_most_used;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i8 = R.id.button_recent;
                }
            } else {
                i8 = R.id.button_name;
            }
            materialButtonToggleGroup.b(i8, true);
            materialButtonToggleGroup.f10006f.add(lVar.f6987z);
            Chip chip = (Chip) dVar3.f299i;
            chip.setChecked(jVar.f7448b);
            final int i24 = 0;
            chip.setOnClickListener(new View.OnClickListener() { // from class: X4.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i24) {
                        case 0:
                            lVar.f6984w.m(Boolean.valueOf(((Chip) dVar3.f299i).isChecked()));
                            return;
                        case 1:
                            lVar.f6985x.m(Boolean.valueOf(((Chip) dVar3.f298h).isChecked()));
                            return;
                        default:
                            lVar.f6986y.m(Boolean.valueOf(((MaterialButton) dVar3.f297g).f10000r));
                            return;
                    }
                }
            });
            Chip chip2 = (Chip) dVar3.f298h;
            chip2.setChecked(jVar.f7449c);
            final int i25 = 1;
            chip2.setOnClickListener(new View.OnClickListener() { // from class: X4.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i25) {
                        case 0:
                            lVar.f6984w.m(Boolean.valueOf(((Chip) dVar3.f299i).isChecked()));
                            return;
                        case 1:
                            lVar.f6985x.m(Boolean.valueOf(((Chip) dVar3.f298h).isChecked()));
                            return;
                        default:
                            lVar.f6986y.m(Boolean.valueOf(((MaterialButton) dVar3.f297g).f10000r));
                            return;
                    }
                }
            });
            MaterialButton materialButton3 = (MaterialButton) dVar3.f297g;
            materialButton3.setChecked(jVar.f7450d);
            final int i26 = 2;
            materialButton3.setOnClickListener(new View.OnClickListener() { // from class: X4.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i26) {
                        case 0:
                            lVar.f6984w.m(Boolean.valueOf(((Chip) dVar3.f299i).isChecked()));
                            return;
                        case 1:
                            lVar.f6985x.m(Boolean.valueOf(((Chip) dVar3.f298h).isChecked()));
                            return;
                        default:
                            lVar.f6986y.m(Boolean.valueOf(((MaterialButton) dVar3.f297g).f10000r));
                            return;
                    }
                }
            });
        }
    }

    @Override // t0.U
    public final s0 e(ViewGroup viewGroup, int i4) {
        int i8 = R.id.top_divider;
        int i9 = R.id.scenario_details;
        int i10 = R.id.button_export;
        int i11 = R.id.scenario_name;
        switch (i4) {
            case R.layout.item_dumb_scenario /* 2131427467 */:
                View h8 = A.j.h(viewGroup, R.layout.item_dumb_scenario, viewGroup, false);
                MaterialButton materialButton = (MaterialButton) E2.b.r(h8, R.id.button_copy);
                if (materialButton != null) {
                    MaterialButton materialButton2 = (MaterialButton) E2.b.r(h8, R.id.button_delete);
                    if (materialButton2 != null) {
                        MaterialButton materialButton3 = (MaterialButton) E2.b.r(h8, R.id.button_expand_collapse);
                        if (materialButton3 != null) {
                            MaterialRadioButton materialRadioButton = (MaterialRadioButton) E2.b.r(h8, R.id.button_export);
                            if (materialRadioButton != null) {
                                i10 = R.id.click_count;
                                MaterialTextView materialTextView = (MaterialTextView) E2.b.r(h8, R.id.click_count);
                                if (materialTextView != null) {
                                    i10 = R.id.dumb_actions_layout;
                                    if (((ConstraintLayout) E2.b.r(h8, R.id.dumb_actions_layout)) != null) {
                                        i10 = R.id.duration_limit;
                                        MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(h8, R.id.duration_limit);
                                        if (materialTextView2 != null) {
                                            i10 = R.id.layout_action_description;
                                            if (((LinearLayout) E2.b.r(h8, R.id.layout_action_description)) != null) {
                                                i10 = R.id.pause_count;
                                                MaterialTextView materialTextView3 = (MaterialTextView) E2.b.r(h8, R.id.pause_count);
                                                if (materialTextView3 != null) {
                                                    i10 = R.id.repeat_limit;
                                                    MaterialTextView materialTextView4 = (MaterialTextView) E2.b.r(h8, R.id.repeat_limit);
                                                    if (materialTextView4 != null) {
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) E2.b.r(h8, R.id.scenario_details);
                                                        if (constraintLayout != null) {
                                                            MaterialTextView materialTextView5 = (MaterialTextView) E2.b.r(h8, R.id.scenario_name);
                                                            if (materialTextView5 != null) {
                                                                i9 = R.id.swipe_count;
                                                                MaterialTextView materialTextView6 = (MaterialTextView) E2.b.r(h8, R.id.swipe_count);
                                                                if (materialTextView6 != null) {
                                                                    MaterialDivider materialDivider = (MaterialDivider) E2.b.r(h8, R.id.top_divider);
                                                                    if (materialDivider != null) {
                                                                        return new b(new H3.b((MaterialCardView) h8, materialButton, materialButton2, materialButton3, materialRadioButton, materialTextView, materialTextView2, materialTextView3, materialTextView4, constraintLayout, materialTextView5, materialTextView6, materialDivider, 2), this.f6961f, this.f6962g, this.f6963h, this.f6964i, this.j);
                                                                    }
                                                                }
                                                            } else {
                                                                i8 = R.id.scenario_name;
                                                            }
                                                        }
                                                        i8 = i9;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i8 = i10;
                        } else {
                            i8 = R.id.button_expand_collapse;
                        }
                    } else {
                        i8 = R.id.button_delete;
                    }
                } else {
                    i8 = R.id.button_copy;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(h8.getResources().getResourceName(i8)));
            case R.layout.item_empty_scenario /* 2131427468 */:
                View h9 = A.j.h(viewGroup, R.layout.item_empty_scenario, viewGroup, false);
                MaterialButton materialButton4 = (MaterialButton) E2.b.r(h9, R.id.button_delete);
                if (materialButton4 != null) {
                    MaterialButton materialButton5 = (MaterialButton) E2.b.r(h9, R.id.button_start);
                    if (materialButton5 != null) {
                        MaterialTextView materialTextView7 = (MaterialTextView) E2.b.r(h9, R.id.scenario_name);
                        if (materialTextView7 != null) {
                            return new d(new A4.a((MaterialCardView) h9, materialButton4, materialButton5, materialTextView7, 20), this.f6961f, this.j);
                        }
                    } else {
                        i11 = R.id.button_start;
                    }
                } else {
                    i11 = R.id.button_delete;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(h9.getResources().getResourceName(i11)));
            case R.layout.item_ordering_and_filtering /* 2131427484 */:
                View h10 = A.j.h(viewGroup, R.layout.item_ordering_and_filtering, viewGroup, false);
                int i12 = R.id.button_group_ordering;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) E2.b.r(h10, R.id.button_group_ordering);
                if (materialButtonToggleGroup != null) {
                    i12 = R.id.button_most_used;
                    if (((Button) E2.b.r(h10, R.id.button_most_used)) != null) {
                        i12 = R.id.button_name;
                        if (((Button) E2.b.r(h10, R.id.button_name)) != null) {
                            i12 = R.id.button_recent;
                            if (((Button) E2.b.r(h10, R.id.button_recent)) != null) {
                                i12 = R.id.checkbox_sort_order;
                                MaterialButton materialButton6 = (MaterialButton) E2.b.r(h10, R.id.checkbox_sort_order);
                                if (materialButton6 != null) {
                                    i12 = R.id.chip_dumb;
                                    Chip chip = (Chip) E2.b.r(h10, R.id.chip_dumb);
                                    if (chip != null) {
                                        i12 = R.id.chipGroup;
                                        if (((ChipGroup) E2.b.r(h10, R.id.chipGroup)) != null) {
                                            i12 = R.id.chip_smart;
                                            Chip chip2 = (Chip) E2.b.r(h10, R.id.chip_smart);
                                            if (chip2 != null) {
                                                return new l(new A4.d((ConstraintLayout) h10, materialButtonToggleGroup, materialButton6, chip, chip2, 14), this.k, this.f6965l, this.f6966m, this.f6967n);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(h10.getResources().getResourceName(i12)));
            case R.layout.item_smart_scenario /* 2131427488 */:
                View h11 = A.j.h(viewGroup, R.layout.item_smart_scenario, viewGroup, false);
                MaterialButton materialButton7 = (MaterialButton) E2.b.r(h11, R.id.button_copy);
                if (materialButton7 != null) {
                    MaterialButton materialButton8 = (MaterialButton) E2.b.r(h11, R.id.button_delete);
                    if (materialButton8 != null) {
                        MaterialButton materialButton9 = (MaterialButton) E2.b.r(h11, R.id.button_expand_collapse);
                        if (materialButton9 != null) {
                            MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) E2.b.r(h11, R.id.button_export);
                            if (materialRadioButton2 != null) {
                                i10 = R.id.detection_quality;
                                MaterialTextView materialTextView8 = (MaterialTextView) E2.b.r(h11, R.id.detection_quality);
                                if (materialTextView8 != null) {
                                    i10 = R.id.list_event;
                                    RecyclerView recyclerView = (RecyclerView) E2.b.r(h11, R.id.list_event);
                                    if (recyclerView != null) {
                                        i10 = R.id.no_image_events;
                                        MaterialTextView materialTextView9 = (MaterialTextView) E2.b.r(h11, R.id.no_image_events);
                                        if (materialTextView9 != null) {
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) E2.b.r(h11, R.id.scenario_details);
                                            if (constraintLayout2 != null) {
                                                MaterialTextView materialTextView10 = (MaterialTextView) E2.b.r(h11, R.id.scenario_name);
                                                if (materialTextView10 != null) {
                                                    MaterialDivider materialDivider2 = (MaterialDivider) E2.b.r(h11, R.id.top_divider);
                                                    if (materialDivider2 != null) {
                                                        i8 = R.id.trigger_event_count;
                                                        MaterialTextView materialTextView11 = (MaterialTextView) E2.b.r(h11, R.id.trigger_event_count);
                                                        if (materialTextView11 != null) {
                                                            return new i(new F3.f((MaterialCardView) h11, materialButton7, materialButton8, materialButton9, materialRadioButton2, materialTextView8, recyclerView, materialTextView9, constraintLayout2, materialTextView10, materialDivider2, materialTextView11), this.f6960e, this.f6961f, this.f6962g, this.f6963h, this.f6964i, this.j);
                                                        }
                                                    }
                                                } else {
                                                    i8 = R.id.scenario_name;
                                                }
                                            } else {
                                                i8 = R.id.scenario_details;
                                            }
                                        }
                                    }
                                }
                            }
                            i8 = i10;
                        } else {
                            i8 = R.id.button_expand_collapse;
                        }
                    } else {
                        i8 = R.id.button_delete;
                    }
                } else {
                    i8 = R.id.button_copy;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(h11.getResources().getResourceName(i8)));
            default:
                throw new IllegalArgumentException("Unsupported view type !");
        }
    }

    @Override // t0.U
    public final void f(s0 s0Var) {
        o6.j.e(s0Var, "holder");
        if (s0Var instanceof l) {
            l lVar = (l) s0Var;
            A4.d dVar = lVar.f6982u;
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) dVar.f296f;
            materialButtonToggleGroup.f10006f.remove(lVar.f6987z);
            ((Chip) dVar.f299i).setOnClickListener(null);
            ((Chip) dVar.f298h).setOnClickListener(null);
            ((MaterialButton) dVar.f297g).setOnClickListener(null);
        }
    }
}
