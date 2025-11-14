package n0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import n1.AbstractC1149a;
import o.C1207p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ln0/b;", "Ln0/J;", "Ln0/a;", "navigation-runtime_release"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, 0, 0}, xi = 48)
@InterfaceC1119I("activity")
/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1124b extends AbstractC1120J {

    /* renamed from: c, reason: collision with root package name */
    public final Context f12745c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f12746d;

    public C1124b(Context context) {
        Object obj;
        this.f12745c = context;
        Iterator it = H7.m.T(context, new H7.o(21)).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f12746d = (Activity) obj;
    }

    @Override // n0.AbstractC1120J
    public final AbstractC1143u a() {
        return new AbstractC1143u(this);
    }

    @Override // n0.AbstractC1120J
    public final AbstractC1143u c(AbstractC1143u abstractC1143u, Bundle bundle, C1148z c1148z) {
        Intent intent;
        int intExtra;
        AbstractC1117G abstractC1117G;
        String encode;
        C1123a c1123a = (C1123a) abstractC1143u;
        C1207p c1207p = c1123a.f12813e;
        if (c1123a.j != null) {
            Intent intent2 = new Intent(c1123a.j);
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = c1123a.k;
                if (str != null && str.length() != 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        o6.j.b(group);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            C1130h c1130h = (C1130h) c1123a.j().get(group);
                            if (c1130h != null) {
                                abstractC1117G = c1130h.f12754a;
                            } else {
                                abstractC1117G = null;
                            }
                            if (abstractC1117G != null) {
                                encode = abstractC1117G.f(abstractC1117G.a(group, bundle));
                            } else {
                                encode = Uri.encode(String.valueOf(bundle.get(group)));
                            }
                            stringBuffer.append(encode);
                        } else {
                            throw new IllegalArgumentException(("Could not find " + group + " in " + bundle + " to fill data pattern " + str).toString());
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            Activity activity = this.f12746d;
            if (activity == null) {
                intent2.addFlags(268435456);
            }
            if (c1148z != null && c1148z.f12829a) {
                intent2.addFlags(536870912);
            }
            int i4 = 0;
            if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", c1207p.f13342a);
            Context context = this.f12745c;
            Resources resources = context.getResources();
            if (c1148z != null) {
                int i8 = c1148z.f12836h;
                int i9 = c1148z.f12837i;
                if ((i8 > 0 && o6.j.a(resources.getResourceTypeName(i8), "animator")) || (i9 > 0 && o6.j.a(resources.getResourceTypeName(i9), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i8) + " and popExit resource " + resources.getResourceName(i9) + " when launching " + c1123a);
                } else {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i8);
                    o6.j.b(intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i9));
                }
            }
            context.startActivity(intent2);
            if (c1148z != null && activity != null) {
                int i10 = c1148z.f12834f;
                int i11 = c1148z.f12835g;
                if ((i10 > 0 && o6.j.a(resources.getResourceTypeName(i10), "animator")) || (i11 > 0 && o6.j.a(resources.getResourceTypeName(i11), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i10) + " and exit resource " + resources.getResourceName(i11) + "when launching " + c1123a);
                    return null;
                }
                if (i10 >= 0 || i11 >= 0) {
                    if (i10 < 0) {
                        i10 = 0;
                    }
                    if (i11 >= 0) {
                        i4 = i11;
                    }
                    activity.overridePendingTransition(i10, i4);
                }
            }
            return null;
        }
        throw new IllegalStateException(AbstractC1149a.h(new StringBuilder("Destination "), c1207p.f13342a, " does not have an Intent set.").toString());
    }

    @Override // n0.AbstractC1120J
    public final boolean j() {
        Activity activity = this.f12746d;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }
}
