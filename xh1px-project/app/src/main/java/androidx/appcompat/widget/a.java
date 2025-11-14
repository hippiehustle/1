package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SearchView f8505d;

    public a(SearchView searchView) {
        this.f8505d = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String flattenToShortString;
        SearchView searchView = this.f8505d;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f8448s;
        if (view == searchView.f8452w) {
            searchView.w(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f8430P;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f8454y) {
            searchView.m();
            return;
        }
        if (view == searchView.f8453x) {
            searchView.q();
            return;
        }
        if (view == searchView.f8455z) {
            SearchableInfo searchableInfo = searchView.f8444g0;
            if (searchableInfo != null) {
                try {
                    if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        Intent intent = new Intent(searchView.K);
                        ComponentName searchActivity = searchableInfo.getSearchActivity();
                        if (searchActivity == null) {
                            flattenToShortString = null;
                        } else {
                            flattenToShortString = searchActivity.flattenToShortString();
                        }
                        intent.putExtra("calling_package", flattenToShortString);
                        searchView.getContext().startActivity(intent);
                        return;
                    }
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.k(searchView.f8426L, searchableInfo));
                        return;
                    }
                    return;
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                    return;
                }
            }
            return;
        }
        if (view == searchAutoComplete) {
            searchView.l();
        }
    }
}
