package Q1;

import D2.f;
import W0.d;
import Z.g;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textview.MaterialTextView;
import g0.r;
import i.AbstractC0862a;
import i.C0865d;
import kotlin.Metadata;
import o6.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ1/b;", "Lg0/r;", "<init>", "()V", "quality_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b extends r {

    /* renamed from: s0, reason: collision with root package name */
    public d f4768s0;

    @Override // g0.r
    public final Dialog T() {
        View inflate = k().inflate(R.layout.dialog_accessibility_troubleshooting, (ViewGroup) null, false);
        int i4 = R.id.button_open_website;
        MaterialButton materialButton = (MaterialButton) E2.b.r(inflate, R.id.button_open_website);
        if (materialButton != null) {
            i4 = R.id.button_understood;
            MaterialButton materialButton2 = (MaterialButton) E2.b.r(inflate, R.id.button_understood);
            if (materialButton2 != null) {
                i4 = R.id.desc_permission;
                if (((MaterialTextView) E2.b.r(inflate, R.id.desc_permission)) != null) {
                    i4 = R.id.dialog_content;
                    if (((NestedScrollView) E2.b.r(inflate, R.id.dialog_content)) != null) {
                        i4 = R.id.divider_top;
                        if (((MaterialDivider) E2.b.r(inflate, R.id.divider_top)) != null) {
                            i4 = R.id.title_permission;
                            if (((MaterialTextView) E2.b.r(inflate, R.id.title_permission)) != null) {
                                d dVar = new d((LinearLayout) inflate, materialButton, materialButton2);
                                final int i8 = 0;
                                materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: Q1.a

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ b f4767e;

                                    {
                                        this.f4767e = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i8) {
                                            case 0:
                                                Context j = this.f4767e.j();
                                                if (j != null) {
                                                    Uri parse = Uri.parse("https://dontkillmyapp.com");
                                                    j.d(parse, "parse(...)");
                                                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                                                    intent.setFlags(268435456);
                                                    if (!AbstractC0862a.r(j, intent)) {
                                                        Intent makeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
                                                        makeMainSelectorActivity.setData(parse);
                                                        makeMainSelectorActivity.setFlags(268435456);
                                                        AbstractC0862a.r(j, makeMainSelectorActivity);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                this.f4767e.S(false, false);
                                                return;
                                        }
                                    }
                                });
                                final int i9 = 1;
                                materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: Q1.a

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ b f4767e;

                                    {
                                        this.f4767e = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i9) {
                                            case 0:
                                                Context j = this.f4767e.j();
                                                if (j != null) {
                                                    Uri parse = Uri.parse("https://dontkillmyapp.com");
                                                    j.d(parse, "parse(...)");
                                                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                                                    intent.setFlags(268435456);
                                                    if (!AbstractC0862a.r(j, intent)) {
                                                        Intent makeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
                                                        makeMainSelectorActivity.setData(parse);
                                                        makeMainSelectorActivity.setFlags(268435456);
                                                        AbstractC0862a.r(j, makeMainSelectorActivity);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                this.f4767e.S(false, false);
                                                return;
                                        }
                                    }
                                });
                                this.f4768s0 = dVar;
                                s5.b bVar = new s5.b(O());
                                d dVar2 = this.f4768s0;
                                if (dVar2 != null) {
                                    ((C0865d) bVar.f3288e).f11674q = (LinearLayout) dVar2.f6489e;
                                    return bVar.c();
                                }
                                j.i("viewBinding");
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // g0.r, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        j.e(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        Bundle bundle = Bundle.EMPTY;
        j.d(bundle, "EMPTY");
        f.I(this, ":AccessibilityTroubleshootingDialog:result", bundle);
    }
}
